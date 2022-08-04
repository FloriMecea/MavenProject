package curs19;

import java.sql.Connection;

public class TestDB {
	
	public static String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	public static String USER = "demouser";
	public static String PASS = "demouser";

	public static void main(String[] args) {
		Connection conn= DbConn.openDBConnection(URL, USER, PASS);
		
		String selectQuery="select * from customers;";
		
		String updateQuery = "update customers set CustomerName='Flori' where CustomerName='aaabbb';";
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		DBQuerys.dbUpdateQuery(conn, updateQuery);
		
		System.out.println("__________________");
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		DbConn.closeDBConnection(conn);
		
		String deleteQuery = "delete from customers where CustomerName='Dragos';";
		System.out.println("--------------------------------------------------------");
		DBQuerys.dbDeleteQuery(conn, deleteQuery);
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		
	
	}

}
