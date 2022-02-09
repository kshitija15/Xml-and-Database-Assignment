package io.sevenx.employeemanagement;

 import io.sevenx.employeemanagement.data.Employee;
import io.sevenx.employeemanagement.db.DatabaseManagement;
import io.sevenx.employeemanagement.ui.Display;
import io.sevenx.employeemanagement.xml.EmployeeXmlParser;

import java.sql.SQLException;
import java.util.List;

//import io.sevenx.employeemanagement.data.Developer;
 //import io.sevenx.employeemanagement.data.Hr;
public class EmployeeManagementMain {

	
	public static void main(String[] args) throws SQLException {
		
		// TODO Auto-generated method stub
//         System.out.println("Test");
//         Employee employee =new Employee();
//         employee.setFirstName("Kshitija");
//         employee.setLastName("Randive");
//         employee.setEmail("kshitija@sevenx.io");
//         employee.setBaseSalary(12500);
//         System.out.println("Display Name:" + employee.getFirstName() + " " + employee.getLastName());
//         System.out.println("EmployeeId :" + employee.getEmployeeId());
//         System.out.println("Email :" + employee.getEmail());
//         System.out.println("Basic Salary :" + employee.getSalary());
         
//         Developer developer=new Developer();
//         developer.setFirstName("Ram");
//         developer.setLastName("Singh");
//         developer.setBaseSalary(12500);
//         developer.setBonusSalary(5000);
//         System.out.println("Display Name:" + developer.getFirstName() + " " + developer.getLastName());
//         System.out.println("EmployeeId :" + developer.getEmployeeId());
//         
        
         
//         System.out.println("Basic Salary :" + developer.getSalary());

         String path="C:\\Users\\kshitija randive\\eclipse-workspace\\EmployeeManagement\\src\\io\\sevenx\\employeemanagement\\xml\\employees.xml";
         List<Employee> employee=EmployeeXmlParser.parser(path);
         DatabaseManagement.insertInDatabase(employee);
         List<Employee> employeeList =DatabaseManagement.fetchFromDatabase();
         
         Display.printEmployeeInformation(employeeList);
         


         
	}

}
