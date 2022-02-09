package io.sevenx.employeemanagement.data;

public class Employee {
 
	private static int maxEmployeeId=0; 
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private int baseSalary;
	
	public Employee(){
		setEmployeeId(++maxEmployeeId);
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		if(email==null) {
			setEmail(firstName +" ." + lastName + "@sevenx.io");	}
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	 public static int getMaxEmployeeId() {
	        return maxEmployeeId;
	    }

	    public static void setMaxEmployeeId(int maxEmployeeId) {
	        Employee.maxEmployeeId = maxEmployeeId;
}
}
