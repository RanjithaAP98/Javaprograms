package com.xworkz.packagesandimport.login;

public class Student {
	public int rollnum;
	public String name;
	public String collegename;
	
	public Student()
	{
		System.out.println("...........");	
	}
	 
	public Student(int inrollnum, String inname,String incollegename)
	{
		rollnum=inrollnum;
		 name=inname;
	    collegename=incollegename;
	}
	  public void printDetails()
	  {
		  System.out.println(" deatails of student");
		  System.out.println("details of student :" + rollnum + " ," + collegename);  
	  }

}
