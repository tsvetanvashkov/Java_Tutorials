package JAVA_AND_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Connecting {
	
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	
	public static void main(String[] args) throws SQLException {
		
		Properties props = new Properties();
		props.setProperty("user","ORACLE");
		props.setProperty("password", "root");
		
		Connection conn = null;
		java.sql.Statement stmnt = null;
		ResultSet rs = null;
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//ideqta na Class.forName e da napravi loader da se zarejda klasa
			conn = DriverManager.getConnection(url, props );
			
			if(conn != null){
				
				System.out.println("You have connected to the database");
				
			} else {
				System.out.println("Cannot connecto to the database");
			}
			
			String query = "select * from CAR";
			stmnt = conn.createStatement();
			
			//create statement is to send object to SQL database
			
			rs = stmnt.executeQuery(query);
			//System.out.println("asdfasdfasd");
			while (rs.next()) {
				
				String marka = rs.getString(4);
				System.out.println(marka);
				
			}
			
			stmnt.close();
			rs.close();
			conn.close();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null){
				conn.close();
			}
		}	
		
	}

}
