package io.sevenx.employeemanagement.data;

public class Developer extends Employee{
	
	 private int BonusSalary;
	 
	 public int getBonusSalary() {
		 return BonusSalary;
	 }
      public void setBonusSalary(int BonusSalary) {
    	  this.BonusSalary=BonusSalary;
      }
      public int getSalary() {
    	  return getBaseSalary()+this.BonusSalary;
      }
}
