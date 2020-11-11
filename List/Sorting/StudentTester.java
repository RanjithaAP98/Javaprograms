package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentTester {  
	
	public static void main(String[] args) {

	Student s1 = new Student("Rohan", 16, "J P nagar");
	Student s2 = new Student("Rahul", 16, "R R nagar");
	Student s3 = new Student("Reka", 18, "RajajiNagar");
	Student s4 = new Student("Ruhi", 14, "Jayanagar");
	
	ArrayList<Student> student = new ArrayList<Student>();
	
	student.add(s1);
	student.add(s2);
	student.add(s3);
	student.add(s4);
	
	System.out.println(student);
	
	Comparator<Student> comparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
	Comparator<Student> comparator2 = (o1, o2) -> o1.getAge() - o2.getAge();

	student.sort(comparator1);
	System.out.println();
	System.out.println("Sorting w.r.t name");
	System.out.println(student);
	
	student.sort(comparator2);
	System.out.println();
	System.out.println("Sorting w.r.t age");
	System.out.println(student);

	}

}
