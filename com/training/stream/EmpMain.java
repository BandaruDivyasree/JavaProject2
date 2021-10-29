package com.training.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


//Considering a City for Sorting 
class CitySort implements Comparator<Employee>{

	@Override
	public int compare(Employee object1, Employee object2) {
		// TODO Auto-generated method stub
		return object1.City.compareTo(object2.City);
	}
	
}



public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a list and add details to a list
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Divya","Anantapur",1));
		empList.add(new Employee("Prathyu","Bangalore",2));
		empList.add(new Employee("Mrudula","Hyderabad",3));
		empList.add(new Employee("Sai","Tirupati",4));
		empList.add(new Employee("Sushma","Chennai",5));
		//System.out.println(empList);
	
		
	//Print all Employees	
    for(Employee emp:empList) {
    	System.out.println(emp);
    }
    //Converting list to stream
    Stream<Employee> empStream=empList.stream();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter City");
    String empCity=s.next();
    Stream<Employee> basedOnCity=empStream.filter((employee)-> employee.City.equals(empCity) );
    //System.out.println(basedOnCity);
    
    //using Iterator based on the city the employee details has to come 
    Iterator<Employee> it=basedOnCity.iterator();
     while(it.hasNext()) {
    	Employee emp=it.next();
    	System.out.println(emp);
     }
     System.out.println();
     //sorting with city
     System.out.println("Employees sorted with City");
     CitySort city=new CitySort();
     Collections.sort(empList,city);
     
     
     //cit refers as cityiterator
     Iterator<Employee> cit=empList.iterator();
     while(cit.hasNext()) {
    	Employee emp=cit.next();
    	System.out.println(emp);
     }
     
   //employee with id
     System.out.println("Employee Id");
     int id=s.nextInt();
     try {
    	 Employee empid=empList.stream().filter(Employee->Employee.empid==id).findFirst()
    			 .orElseThrow(()->new Exception("Employee Not Found"));
    			 System.out.println("Employee:"+empid);
     }catch(Exception e) {
    	 System.out.println(e);
     }
     System.out.println();
     //Print employee name starts with k 
     //if not there throw an exception
    System.out.println("Name starts with k");
    try {
    Employee empid=empList.stream().filter(emp1->emp1.name.startsWith("k")).findFirst()
			 .orElseThrow(()->new Exception("Employee Not Found"));
			 System.out.println("Employee:"+empid);
	 } catch (Exception e) {
    	 System.out.println(e);
	 }

	}
}

