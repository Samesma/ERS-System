package com.revature.models;

import java.sql.Timestamp;

public class ERSReimbursement {
	
	
	private int id;
	private float amount;
	private String description;
	private Timestamp resolveddate;
	private Timestamp submitteddate;
	private int authorid;
	private int resolverid;
	private int statusid;
	private int typeid;
	
	private ERSReciept reciept;
	private ERSUser author;
	private ERSUser resolver;
	private ERSReimbursementStatus status;
	private ERSReimbursementType type;
	


	public ERSReimbursement()
	{
		
	}
	
	public ERSReimbursement(int id, float amount, String description, Timestamp resolveddate, Timestamp submitteddate,
			int authorid, int resolverid, int statusid, int typeid) {
		super();
		this.id = id;
		this.amount = amount;
		this.description = description;
		this.resolveddate = resolveddate;
		this.submitteddate = submitteddate;
		this.authorid = authorid;
		this.resolverid = resolverid;
		this.statusid = statusid;
		this.typeid = typeid;
		
	}
	
	public ERSReimbursement( float amount, String description,
			int authorid,int resolverid, int statusid, int typeid)
	{
		super();
		this.amount = amount;
		this.description = description;
		this.authorid = authorid;
		this.resolverid = resolverid;
		this.statusid = statusid;
		this.typeid = typeid;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getResolveddate() {
		return resolveddate;
	}
	public void setResolveddate(Timestamp resolveddate) {
		this.resolveddate = resolveddate;
	}
	public Timestamp getSubmitteddate() {
		return submitteddate;
	}
	public void setSubmitteddate(Timestamp submitteddate) {
		this.submitteddate = submitteddate;
	}
	public ERSUser getAuthor() {
		return author;
	}
	public void setAuthor(ERSUser author) {
		this.author = author;
	}
	public ERSUser getResolver() {
		return resolver;
	}
	public void setResolver(ERSUser resolver) {
		this.resolver = resolver;
	}
	public ERSReimbursementStatus getStatus() {
		return status;
	}
	public void setStatus(ERSReimbursementStatus status) {
		this.status = status;
	}
	public ERSReimbursementType getType() {
		return type;
	}
	public void setType(ERSReimbursementType type) {
		this.type = type;
	}
	public ERSReciept getReciept() {
		return reciept;
	}
	public void setReciept(ERSReciept reciept) {
		this.reciept = reciept;
	}
	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public int getResolverid() {
		return resolverid;
	}

	public void setResolverid(int resolverid) {
		this.resolverid = resolverid;
	}

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	
	@Override
	public String toString() {
		//return "Reimbursemnet [id=" + id + ", amount=" + amount + ", lastName=" + lastName + ", email=" + email
			//	+ ", username=" + username + ", password=" + password + ", role:"+userrole.getRole()+"]";
		return null;
	}
}
