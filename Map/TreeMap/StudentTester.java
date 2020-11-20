package com.xworkz.map;

import java.util.Comparator;
import java.util.TreeMap;

public class StudentTester {

	public static void main(String[] args) {
		
		//Usn-Student
		TreeMap<Integer,Student> student = new TreeMap<Integer,Student>();
		
		Student std1 = new Student("Ranjitha", 22);
		Student std2 = new Student("Amrutha", 20);
		Student std3 = new Student("Gagana", 24);
		
		student.put(103, std1);
		student.put(101, std2);
		student.put(102, std3);
		
		System.out.println(student);
		
		//Traversing :
		System.out.println();		
		student.forEach((k,v) -> System.out.println("key: "+ k + " Value: "+ v));
			
		System.out.println();
		
		
		
		//Provide Comparator
		Comparator<Student> comp = (o1, o2)-> o1.getAge() - o2.getAge();
			   //Student-Usn
		TreeMap<Student,Integer> std = new TreeMap<Student,Integer>(comp);
		
		std.put(std1, 108);
		std.put(std3, 105);
		std.put(std2, 104);
		
		System.out.println(std);
		
		//Traversing :
		System.out.println();		
		std.forEach((k,v) -> System.out.println("key: "+ k + " Value: "+ v));
		
	}

}
