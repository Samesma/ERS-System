package com.revature.models;

import java.util.List;

public class ERSReimbursementType {
	
	
	
	private int id;
	private String type;
	
	private List<ERSReimbursement> reimbursements;
	
	public ERSReimbursementType()
	{
		
	}
	
	public ERSReimbursementType(int id, String type)
	{
		this.id = id;
		this.type = type;
	}
	
	public ERSReimbursementType(String type)
	{
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public List<ERSReimbursement> getReimbursements() {
		return reimbursements;
	}

	public void setReimbursements(List<ERSReimbursement> reimbursements) {
		this.reimbursements = reimbursements;
	} 
	

	

}
