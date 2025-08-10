package com.wipro.jdbcdemo;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 

{
	static String jdbcUrl = "jdbc:mysql://localhost:3306/employee";
    static String username = "root"; 
    static String password = "root"; 
    public static void main( String[] args )
    {
 
        
       
        
    	
        
    }
    public static void readEmployee() {
    	
    	String selectSQL = "SELECT empid, empname, empdepartment FROM employee";
    	try {
			Connection con=DriverManager.getConnection(jdbcUrl, username, password);
			 Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL) ;
             while (rs.next()) {
                 int id = rs.getInt("empid");
                 String name = rs.getString("empname");
                 String dept = rs.getString("empdepartment");

                 System.out.printf("%-5d %-20s %-20s%n", id, name, dept);

             }
             
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
    public static void InsertData() {
    	
    	 try {
 			Connection con=DriverManager.getConnection(jdbcUrl, username, password);
 			System.out.println("Connection Establihsed successfully");
 			String insertData="Insert into employee(empname,empdepartment) values(?,?)";
 			PreparedStatement pstmt=con.prepareStatement(insertData);
// 			pstmt.setString(1,"Jayasree");
// 			pstmt.setString(2, "CSE");
// 			pstmt.setString(1,"Lakshmi");
// 			pstmt.setString(2, "ECE");
 			pstmt.execute();
 			System.out.println("Inserted data successfully");
 			readEmployee();
 		
 			con.close();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	
    }
}
