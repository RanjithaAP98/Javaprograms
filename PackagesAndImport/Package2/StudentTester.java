package com.xworkz.packagesandimport.login.forgotpassword;

import com.xworkz.packagesandimport.login.Student;
public class StudentTester {
	
	public static void main(String args[]) {
		
		com.xworkz.packagesandimport.login.Student std1 = new com.xworkz.packagesandimport.login.Student();
		 std1.rollnum = 1;
		 std1.collegename="kit";
		 std1.printDetails();
		
		com.xworkz.packagesandimport.login.forgotpassword.Student std2 = new com.xworkz.packagesandimport.login.forgotpassword.Student();
		 std1.rollnum=2;
		 std1.name="ranju";
		 std1.printDetails();
	  
		 
}
}