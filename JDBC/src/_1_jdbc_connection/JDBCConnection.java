package _1_jdbc_connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;


public class JDBCConnection {

	//static final is constant i Java
	
	//Credentials - te sa identificirane pred bazata koi si 
	static final String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	/*static final String user = "SYS";
	static final String password = "root";*/
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		
		Properties props = new Properties();
		props.setProperty("user","ORACLE");
		props.setProperty("password", "root");
		
		// TODO Auto-generated method stub
		
		//JDBC Java Database COnnection
		// API - application programming interface
		
		//try catch se naricha exeption 
		//try catch se prilaga za da hvashta greshki i da ne spira cqlata programa
		Connection conn = null;
		java.sql.Statement stmnt = null;
		ResultSet rs = null;
	
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, props );
		
		if(conn != null){
			
			System.out.println("You have connected to the database");
			
		} else {
			System.out.println("Cannot connecto to the database");
		}
		
		//PrepareCall - inserst update, delete na tablici 
		// CallableStament - vika se proceduri
		
		
		//query se baricha zaqvka na sql 
		String query = "select * from test1";
		stmnt = conn.createStatement();
		rs = stmnt.executeQuery(query);
		System.out.println("asdfasdfasd");
		while (rs.next()) {
			
			String marka = rs.getString(1);
			System.out.println(marka);
			
		}
		conn.close();
		stmnt.close();
		rs.close();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		if(conn != null){
			conn.close();
		
		}
		
	}
		
	
	
	}
}
