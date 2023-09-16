/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FeeReportManagement;

/**
 *
 * @author rajar
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionClass {
	private static String dbUrl = "jdbc:mysql:// localhost:3306/";
    private static String dbUsername = "root";
    private static String dbPassword = "R@ja3366";
    private static String dbName = "fee";
	public static void main(String[]args) {
		
		try {
			Connection conn=DriverManager.getConnection(dbUrl+ dbName, dbUsername, dbPassword);
			Statement stmt=conn.createStatement();
			String sql="insert into Accountant(name,password,email,contact) values('Raja','R@ja3366','aaa','123')";
    		stmt.executeUpdate(sql);
    		System.out.println("Entered successfully");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
