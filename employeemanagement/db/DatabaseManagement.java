package io.sevenx.employeemanagement.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import io.sevenx.employeemanagement.data.Employee;

public class DatabaseManagement {
	
	public static final String username="New";
	public static final String password="Newpass@1234";
	public static final String url="jdbc:mysql://localhost:3307/employeemanagement";
	
   public static void insertInDatabase(List<Employee> employeeList){
	   try {
		   
		   Connection con=DriverManager.getConnection(url, username, password);
		   Statement stmt = con.createStatement();
		   for(Employee emp:employeeList) {
			   stmt.execute("INSERT INTO `employeemanagement`.`employee`( `firstName`,`lastName`,`email`,`baseSalary`) VALUES ('"+emp.getFirstName() + "', '" + emp.getLastName() + "', '"+emp.getEmail() +
						"', '" + emp.getBaseSalary() + "');");
		   }
		   
	   }	   
		  
		   
	  catch(Exception e) {
		  e.printStackTrace();
	   }
   }
   public static List<Employee>fetchFromDatabase() throws SQLException{
	   Connection con=DriverManager.getConnection(url, username, password);
	   Statement stmt = con.createStatement();
	   ResultSet r=stmt.executeQuery("SELECT * FROM employeemanagement.employee;");
	   List<Employee> employee=new ArrayList<>();
	   
	   while(r.next()) {
		   
		   Employee e =new Employee();
		   e.setEmployeeId(r.getInt(1));
		   e.setFirstName(r.getString(2));
			e.setLastName(r.getString(3));
			e.setEmail(r.getString(4));
			e.setBaseSalary(r.getInt(5));
			
			employee.add(e);
		   
	   }
	   return employee;

   }
}

