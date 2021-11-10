/**
 * 
 */
package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.models.ERSReimbursement;
/**
 * @author Saeid
 *
 */
public interface ReimbursementDAO {
	
	
	List<ERSReimbursement> getAllReimbursements();
	
	void createReimbursement(ERSReimbursement u) throws SQLException;
	
	void updateReimbursement(ERSReimbursement u);
	
	void deleteReimbursement(ERSReimbursement u);
	

}
