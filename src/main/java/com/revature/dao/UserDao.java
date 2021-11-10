package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.models.ERSUser;

public interface UserDao {
	
	List<ERSUser> getAllUsers();
	
	ERSUser getUserByUsername(String username);
	
	void createUser(ERSUser u) throws SQLException;
	
	void updateUser(ERSUser u);
	
	void deleteUser(ERSUser u);

	
}
