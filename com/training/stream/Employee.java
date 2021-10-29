/*ProjectName:StreamsApp
*Author:Divya
*Version: 1.0
*/


package com.training.stream;

public class Employee {
	//Instance Variables
	String name,City;
	int empid;
	
	//Parameter Constructors
	
	  public Employee(String name,String City, int empid) { 
		  this.name=name;
	      this.City=City;  
	      this.empid=empid;
	  
	  }
	 
	//Default Constructor
	
	  public Employee() {
	  
	  }
	//converting object toString
	@Override
	public String toString() {
		return "Employee [name=" + name + ", City=" + City + ", empid=" + empid + "]";
	}

}
