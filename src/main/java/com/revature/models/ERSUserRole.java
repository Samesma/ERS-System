package com.revature.models;

import java.util.List;

public class ERSUserRole {
	
	private int id;
	private String role;
	private List<ERSUser> users;
	
	public ERSUserRole()
	{
		
	}
	
	public ERSUserRole(int id, String role)
	{
		this.id = id;
		this.role = role;
	}
	
	public ERSUserRole(String role)
	{
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public List<ERSUser> getUsers() {
		return users;
	}

	public void setUsers(List<ERSUser> users) {
		this.users = users;
	} 
	

}
