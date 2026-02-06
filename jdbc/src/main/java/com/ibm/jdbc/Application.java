package com.ibm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application
{
	public static void main( String[] args )
	{
		Car car1 = new Car();
		car1.setCompany("BMW");
		car1.setModel("M2");
		car1.setPrice(7000000);
		
		String query = "Select * from car";
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vechiles","Nithin","nithin123");
			PreparedStatement preparedStatement = connection.prepareStatement(query);){
				ResultSet resultSet=preparedStatement.executeQuery();
				
				while(resultSet.next())
				{
					System.out.print("Car Company : "+ resultSet.getString(1)+" , ");
					System.out.print("Car Model : " +resultSet.getString(2)+" , ");
					System.out.println("Car Price :"+ resultSet.getInt(3));
				}
				
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		
		try {
			
			//1 Register or load the Driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//2.Establish Connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vechiles","Nithin","nithin123");
			
			//3.Statement-Statement,Prepared Statement,Callable Statement
			String query1 = "insert into car(company,model,price) values (?,?,?)";
			PreparedStatement pst = connection.prepareStatement(query1);
			pst.setString(1,car1.getCompany());
			pst.setString(2, car1.getModel());
			pst.setInt(3, car1.getPrice());
			
			int rowsEffected = pst.executeUpdate();
			System.out.println(rowsEffected);
			
			connection.close();
			pst.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}