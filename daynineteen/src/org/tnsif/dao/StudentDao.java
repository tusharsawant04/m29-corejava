package org.tnsif.dao;
//this layer contains the necessary database information

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDao {
	/*A connection (session) with a specific databse
	 * SQL statements are executed and results are 
	 * returned within the context of a connection
	 */
	public Connection createConnection() {
		
		String url="jdbc:mysql://localhost:3306/fastandfurious";
		String username="root";
		String password="Tushar@4";
		
				try {
					/*if the driver class is an incorrect then
					 * it will be handle by using catch block 
					 */
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) 
				{
					System.out.println("Invalid Driver Class Name");
				}
				
				Connection connection;
				try {
				connection=DriverManager.getConnection(url,username,password);
				} catch (SQLException e) {
					System.out.println("Invalid Credentials");
					connection=null;
				}
				return connection;
			
		
	}
}
