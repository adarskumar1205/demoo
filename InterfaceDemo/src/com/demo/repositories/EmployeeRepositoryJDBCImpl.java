package com.demo.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.model.Employee;

public class EmployeeRepositoryJDBCImpl implements EmployeeRepository{
	
	private BasicDataSource dataSource;
	
	public EmployeeRepositoryJDBCImpl(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		try {
			
			Connection connection = this.dataSource.getConnection();
			
			//create the statement object 
			String insertQuery = "INSERT INTO employee values(?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setString(3, employee.getCity());
			preparedStatement.setDouble(4, employee.getSalary());
			
			//execute the statements 
			int rowsAffected = preparedStatement.executeUpdate();		
			
			if(rowsAffected > 0)
				System.out.println("Record is inserted");
			else 
				System.out.println("Record not inserted");
			
			
			//close the connection
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee getEmployee(int empId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
		Employee employee=null;
		
		try {
			
			Connection connection = this.dataSource.getConnection();
			String getEmpQuery = "Select empId,empName,city,salary FROM employee WHERE empId = "+empId+"";
			
			PreparedStatement preparedStatement = connection.prepareStatement(getEmpQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int id = resultSet.getInt("empId");
				String eName  = resultSet.getString("empName");
				String city = resultSet.getString("city");
				double salary = resultSet.getDouble("salary");
				
				employee = new Employee(id,eName,city,salary);
				
				System.out.println(employee.getCity());
			}
		
			resultSet.close();
			connection.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list = new ArrayList<>();
		
		try {
			
			Connection connection = this.dataSource.getConnection();
			String getEmpQuery = "Select empId,empName,city,salary FROM employee";
			
			PreparedStatement preparedStatement = connection.prepareStatement(getEmpQuery);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int id = resultSet.getInt("empId");
				String eName  = resultSet.getString("empName");
				String city = resultSet.getString("city");
				double salary = resultSet.getInt("salary");
				
				list.add(new Employee(id,eName,city,salary));
			}
		
			resultSet.close();
			connection.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void deleteEmployee(int empId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		try {
			
			Connection connection = this.dataSource.getConnection();
			
			//create the statement object 
			String deleteQuery = "DELETE FROM employee where empId="+empId+" ";
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			
			
			//execute the statements 
			int rowsAffected = preparedStatement.executeUpdate();		
			
			if(rowsAffected > 0)
				System.out.println("Record is deleted");
			else 
				System.out.println("Record not deleted");
			
			
			//close the connection
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}