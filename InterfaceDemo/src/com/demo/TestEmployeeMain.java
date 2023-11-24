package com.demo;

import java.util.ArrayList;

import org.apache.commons.dbcp2.BasicDataSource;

import com.demo.config.DBUtil;
import com.demo.exceptions.EmployeeNotFoundException;
import com.demo.model.Employee;
import com.demo.repositories.EmployeeRepository;
import com.demo.repositories.EmployeeRepositoryImpl;
import com.demo.repositories.EmployeeRepositoryJDBCImpl;

public class TestEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EmployeeRepositoryImpl class uses arraylist to store the data 
		
		DBUtil dbUtil = new DBUtil();
		BasicDataSource ds = dbUtil.getDataSource();
		
//		EmployeeRepository empRepo = new EmployeeRepositoryImpl();	
		EmployeeRepository empRepoJDBC = new EmployeeRepositoryJDBCImpl(ds);
		
//		Employee emp1 = new Employee(103, "Mohit", "Mumbai", 4300.00);
//		empRepoJDBC.addEmployee(emp1);
//	
//		Employee emp2 = new Employee(104, "Vaibhav", "Pune", 20000.00);
//		empRepoJDBC.addEmployee(emp2);
//		
//		Employee emp3 = new Employee(105, "Samrat", "Nagpur" ,5300.00);
//		empRepoJDBC.addEmployee(emp3);
		
		
		//get employee details
		
		try {
			Employee empResult = empRepoJDBC.getEmployee(101);
			
			System.out.println("Employee found = " + empResult);
			
			
		}catch(EmployeeNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
//		
		
		//get all employees 
//		ArrayList<Employee> list = empRepoJDBC.getAllEmployees();
//		
//		System.out.println("List of Employees = " +list);
		
		//Delete a Employee
//		try {
//			empRepoJDBC.deleteEmployee(106);
//			
//			
//		}catch(EmployeeNotFoundException ex) {
//			System.out.println(ex.getMessage());
//		}
	
	}

}