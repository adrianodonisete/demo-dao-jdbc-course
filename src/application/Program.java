package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		System.out.println(obj);
		
		
	}

//		Connection conn = null;
//		PreparedStatement st = null;
//		
//		try {
//			conn = DB.getConnection();
//
//			st = conn.prepareStatement(
//					"DELETE FROM department "
//					+"WHERE "
//					+"Id = ?"
//					);
//
//			st.setInt(1, 2);
//			
//			int rowsAffected = st.executeUpdate();
//			
//			System.out.println("Done! Rows Affected: "+rowsAffected);
//			
//		} catch (SQLException e) {
//			throw new DbIntegrityException(e.getMessage());
//			
//		} finally {
//			DB.closeStatement(st);
//			DB.closeConnection();
//		}

}
