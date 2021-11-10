package com.revature.models;

public class ERSUser{

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	private int userroleid;
	private ERSUserRole userrole;
      
	
	public ERSUser() {		
		super();

	}

	public ERSUser(int id,String firstName, String lastName,String email, String username, String password, int userroleid) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.userroleid = userroleid;
	}
	
	public ERSUser(String firstName, String lastName,String email, String username, String password,int userroleid) {
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.userroleid= userroleid;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public ERSUserRole getUserrole() {
		return userrole;
	}


	public void setUserrole(ERSUserRole  userrole) {
		this.userrole =  userrole ;
	}
	
	public int getUserroleid() {
		return userroleid;
	}


	public void setUserroleid(int  userroleid) {
		this.userroleid =  userroleid ;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", role:"+userrole.getRole()+"]";
	}

	
}
