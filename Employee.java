package com.xworkz.constructorchaining;

public class Employee {
	
		public String empName;
	    public int empSalary;
	    public String address;
	    

	    public Employee() //default constructor of the class
	    {
	        this("Ranjitha"); //this will call the constructor with String param
	    }
	    

	    public Employee(String name)
	    {
	    	this(name, 120035);//call the constructor with (String, int) param
	    }
	    
	    
	    public Employee(String name, int sal)
	    {
	    	this(name, sal, "Tiptur"); //call the constructor with (String, int, String) param
	    }
	    
	    
	    public Employee(String name, int sal, String addr)
	    {
	    	this.empName=name;
	    	this.empSalary=sal;
	    	this.address=addr;
	    }

	   public void displayDeatils() {
	    	System.out.println("Employee Name: "+empName);
	    	System.out.println("Employee Salary: "+empSalary);
	    	System.out.println("Employee Address: "+address);
	    }

}
