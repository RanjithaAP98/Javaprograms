package com.xworkz.arrayexample;

public class Student {
	public static void main(String[] args) {
		
		int [] marks;
		marks = new int [4];
		marks[0]=85;
		marks[1]=75;		
		marks[2]=65;
		marks[3]=62;

		int sum = 0;
		 for (int i=0;i<marks.length;i++) {
			 sum+=marks[i];
		 }
		 
		System.out.println("Total marks obtain by the student is "+sum);
		System.out.println("Percentage obtained by the student is "+sum/4 +"%");
}
}