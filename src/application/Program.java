package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		
		
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
