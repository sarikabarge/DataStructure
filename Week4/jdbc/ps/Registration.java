package com.bridgeit.jdbc.ps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner sc=null;
		String name=null,address=null;
		int no=0;
		Connection con=null;
		PreparedStatement preparedStmt=null;
		String query=null;
		boolean result=false;
		try {
			sc=new Scanner(System.in);
			//read inputs
			if(sc!=null) {
				System.out.println("Enter student no:::");
				no=sc.nextInt();
				System.out.println("Enter student name:::");
				name=sc.nextLine(); 
				System.out.println("Enter address :::");
				address=sc.nextLine(); 
			}//if
			//convert input values as required for the SQL Query
			name="'"+name+"'"; 
			address="'"+address+"'";
			//register JDBC driver s/w
			Class.forName("com.mysql.jdbc.Driver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Newreg","root","Admin@123");
						//prepare SQL Query
			  query="insert into Registration values(?,?,?)";
			  System.out.println(query);
			  // create the mysql insert preparedstatement
		      preparedStmt = con.prepareStatement(query);
		      preparedStmt.setInt(1,no);
		      preparedStmt.setString (2,name);
		      preparedStmt.setString (3,address);

		      // execute the preparedstatement
		     result= preparedStmt.execute();
		      
			
				 //process the result
				  if(result==true)
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