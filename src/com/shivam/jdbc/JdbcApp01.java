package com.shivam.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class JdbcApp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
         try {
        	 Class.forName("oracle.jdbc.OracleDriver");
        	 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Shivam");	
        	 DatabaseMetaData md = con.getMetaData();
        	 System.out.println("Database Name             :"+md.getDatabaseProductName());
        	 System.out.println("Database Version          :"+md.getDatabaseProductVersion());
        	 System.out.println("Dirver Major Version      :"+md.getDatabaseMajorVersion());
        	 System.out.println("Driver Minor Version      :"+md.getDatabaseMinorVersion());
        	 System.out.println("Driver name               :"+md.getDriverName());
        	 System.out.println("Diver Version             :"+md.getDriverVersion());
        	 System.out.println("Sql Keyoword              :"+md.getSQLKeywords());
        	 System.out.println("String functions          :"+md.getStringFunctions());
        	 System.out.println("Neumeric functions        :"+md.getNumericFunctions());
        	 System.out.println("Supports BatchUpdations   :"+md.supportsBatchUpdates());
        	 System.out.println("Supports Stored Procedure :"+md.supportsStoredProcedures());
        	 
		} catch (Exception e) {
			
		   try {
			  con.close();
		  } catch (Exception e2) {
			// TODO: handle exception
			  e2.printStackTrace();
		  }
		}
	}

}
