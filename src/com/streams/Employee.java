package com.streams;

import java.util.stream.Collectors;

public class Employee {
	
	private Integer empId;
	private String empName;
	
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
//	productsList.stream()  
//    .filter(p -> {
//   	 if(p.getEmpId() > 3) {
//   		 return true;
//   	 }
//   	 return false;
//   	 })// filtering data  
//    .map(Employee::getEmpName
//   	  )        // fetching price  
//    .collect(Collectors.toList()); // collecting as list  

}
