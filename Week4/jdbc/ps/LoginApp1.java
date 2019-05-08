package com.bridgeit.jdbc.ps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginApp1 {

	public static void main(String[] args) {
		Scanner sc=null;
		String user=null,pass=null;
		Connection con=null;
		PreparedStatement preparedStmt=null;
		String query=null;
	ResultSet rs=null;
		boolean count=false;;
		try {
			sc=new Scanner(System.in);
			//read inputs
			if(sc!=null) {
				System.out.println("Enter username:::");
				user=sc.nextLine(); 
				System.out.println("Enter Password:::");
				pass=sc.nextLine(); 
			}//if
			//convert input values as required for the SQL Query
			user="'"+user+"'"; 
			pass="'"+pass+"'";
			//register JDBC driver s/w
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Loginuser","root","Admin@123");
						//prepare SQL Query
			  query="insert into userlogin values(?,?)";
			  System.out.println(query);
			  // create the mysql insert preparedstatement
		      preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString (1, user);
		      preparedStmt.setString (2, pass);

		      // execute the preparedstatement
		      count=preparedStmt.execute();
		      
			
				  //process the result
				  if(count==true)
					  System.out.println("Invalid Credentials");
				  else
					  System.out.println("Valid Credentials");
		}//try
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close jdbc objs
			
			try {
				if(preparedStmt!=null)
					preparedStmt.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(sc!=null)
					sc.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}//finally

	}//main
}//class