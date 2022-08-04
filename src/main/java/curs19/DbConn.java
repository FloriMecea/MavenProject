package curs19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {

	public static Connection openDBConnection(String URL, String User, String Pass) {
		Connection conn=null;
		
		try {
			conn =DriverManager.getConnection(URL, User, Pass);
			System.out.println("Conexiune cu succes");
		}catch(SQLException e) {
			System.out.println("Nu am putut face conexiune la baza de date");
		}
		
		return conn;
	}
	
	public static void closeDBConnection(Connection conn) {
		try{
			System.out.println("Incerc sa inchid conexiune la baza de date");
			conn.close();
			System.out.println("Conexiune a fost inchisa");
		
			
		}catch(SQLException e) {
			System.out.println("Nu am putut inchide conexiunea la baza de date");
		}
	}
	
	
	
}
