package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.models.ERSReimbursementStatus;

public interface ReimbursementStatusDAO {
	
	
	List<ERSReimbursementStatus> getAllReimbursementStatuses();
	
	void createReimbursementStatus(ERSReimbursementStatus r) throws SQLException;
	
	void updateReimbursementStatus(ERSReimbursementStatus r);
	
	void deleteReimbursementStatus(ERSReimbursementStatus r);

	
	

}
