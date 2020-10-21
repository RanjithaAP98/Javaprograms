package com.xworkz.thiskeyword;

public class Student {
	
	int rollno;  
	String name;  
	float fee;
	
	public Student() {
		this(123, "Anu",5000f);
		System.out.println("Default\no-argument constructor of student");
	}
	
	Student(int rollno,String name,float fee){  
		this.rollno=rollno; //The this keyword can be used to refer current class instance variable
		this.name=name;  
		this.fee=fee;  
	} 
	
	void displayDeatils(){
		System.out.println(rollno+" "+name+" "+fee); 	
	}  

}
