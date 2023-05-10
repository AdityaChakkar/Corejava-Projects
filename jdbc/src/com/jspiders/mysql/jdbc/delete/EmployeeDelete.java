package com.jspiders.mysql.jdbc.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDelete {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int eid = sc.nextInt();

		String url = "jdbc:mysql://localhost:3306/employeedb?user=root&password=root";
		String query = "DELETE FROM EMPLOYEE WHERE EID = ?";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, eid);
		int count = ps.executeUpdate();
		if (count==1) {
			System.out.println("Deleted successfully..!!");
		} else {
			System.out.println("not Deleted..!!");
		}
		connection.close();
	}
}
