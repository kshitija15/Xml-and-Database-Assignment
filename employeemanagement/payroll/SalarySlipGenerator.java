package io.sevenx.employeemanagement.payroll;
//import io.sevenx.employeemanagement.data.Developer;
import io.sevenx.employeemanagement.data.Employee;
//import io.sevenx.employeemanagement.data.Hr;

public class SalarySlipGenerator {
	
	public static void printSalarySlip(Employee employee) {
		System.out.println("Display Name :" + employee.getFirstName() + " " + employee.getLastName());
		System.out.println("Email:" + employee.getEmail());
		System.out.println("Employee id :" + employee.getEmployeeId());
		System.out.println("Salary :" + employee.getBaseSalary());
		
		//public static int updateBonusWithDeveloper(Developer developer) {
			
		}

		


		
		
	}


