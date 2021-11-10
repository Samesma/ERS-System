package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.logging.Logging;
import com.revature.models.ERSUser;
import com.revature.utils.ConnectionUtil;

public class UserDaoDB implements UserDao{
	
	ConnectionUtil conUtil = ConnectionUtil.getConnectionUtil();

	@Override
	public List<ERSUser> getAllUsers() {
		
		
		List<ERSUser> userlist = new ArrayList<ERSUser>();
			
			try {
				Connection con = conUtil.getConnection();
				
				String sql = "SELECT id,first_name,last_name,email,username,passwd,user_role FROM ers_users";
				
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery(sql);
				
				while(rs.next()) {
					ERSUser user = new ERSUser();
					user.setId(rs.getInt(1));
					user.setFirstName(rs.getString(2));
					user.setLastName(rs.getString(3));
					user.setEmail(rs.getString(4));
					user.setUsername(rs.getString(5));
					user.setPassword(rs.getString(6));
					
					user.setUsertype(rs.getString(8));
					userlist.add(user);
				}
				
				return userlist;
				
			} catch(SQLException e) {
						Logging.logger.warn(e.getMessage());
			}
			return null;
		
	}

	@Override
	public ERSUser getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createUser(ERSUser u) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(ERSUser u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(ERSUser u) {
		// TODO Auto-generated method stub
		
	}
	
 
}
