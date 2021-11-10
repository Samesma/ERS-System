package com.revature.models;

import java.util.List;

public class ERSReimbursementStatus {
	

	
	private int id;
	private String status;
	
	private List<ERSReimbursement> reimbursements;
	
	public ERSReimbursementStatus()
	{
		
	}
	
	public ERSReimbursementStatus(int id, String status)
	{
		this.id = id;
		this.status = status;
	}
	
	public ERSReimbursementStatus(String status)
	{
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
