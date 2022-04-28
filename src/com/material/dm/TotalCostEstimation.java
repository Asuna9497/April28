package com.material.dm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.material.bin.Material;

public class TotalCostEstimation {
	
	public void saveTotalCost(Material materialobj1, double totalEstimate, String material1) {
		// load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/output","root", "Asuna@123");
			
			//create statement
			Statement stm = con.createStatement();
			
			String nameofMaterial = material1;
			
			double volume = materialobj1.getVolume();
			double weight = materialobj1.getWeight();
			double costPerUnit = materialobj1.getCostPerUnit();
			double totalCost = materialobj1.getTotalCost();
			
			
			
			//write a query
			String sql = "INSERT INTO Materialcost VALUES ( " + "'" +nameofMaterial+ "'" + "," + volume + "," + weight
			+ "," +costPerUnit + "," +totalCost+  "," +totalEstimate + ")" ; 
			
			stm.executeUpdate(sql);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}

}
