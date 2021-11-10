package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.models.ERSReimbursementType;

public interface ReimbursementTypeDAO {
	
	List<ERSReimbursementType> getAllReimbursementTypes();
	
	void createReimbursementType(ERSReimbursementType t) throws SQLException;
	
	void updateReimbursementType(ERSReimbursementType t);
	
	void deleteReimbursementtype(ERSReimbursementType t);

	
	

}
