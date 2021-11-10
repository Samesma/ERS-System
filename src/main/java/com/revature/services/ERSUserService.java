package com.revature.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import com.revature.dao.UserDao;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.logging.Logging;
import com.revature.models.ERSUser;
import com.revature.models.ERSUserRole;
import com.revature.exceptions.InvalidCredentialsException;
import com.revature.exceptions.UserDoesNotExistException;

public class ERSUserService {
	
private UserDao uDao;
	
	public ERSUserService(UserDao u) {
		this.uDao = u;
	}
	
	public ERSUser signUp(String first, String last, String email, String username, String password) throws UsernameAlreadyExistsException {
		
		ERSUser u = new ERSUser(first, last, email, username, password, new ERSUserRole());
		
		try {
			uDao.createUser(u);
			Logging.logger.info("New user was registered");
		} catch (SQLException e) {
			Logging.logger.warn("Username created that already exists in the database");
			throw new UsernameAlreadyExistsException();
		}
		
		return u;
	}
	
	public ERSUser signIn(String username, String password) throws UserDoesNotExistException, InvalidCredentialsException{
		
		ERSUser u = uDao.getUserByUsername(username);
		
		if(u.getId() == 0) {
			Logging.logger.warn("User tried logging in that does not exist");
			throw new UserDoesNotExistException();
		}
		else if(!u.getPassword().equals(password)) {
			Logging.logger.warn("User tried to login with invalid credentials");
			throw new InvalidCredentialsException();
		}
		else {
			Logging.logger.info("User was logged in");
			return u;
		}
	}
}
