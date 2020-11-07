package com.xworkz.stringconcepts;

public class InsertCommas {
	
	public static void main(String[] args) {
		
		String s = "Welcome to xworkz and you are learning string methods in java";
		
		String[] str = s.split(" ");
		StringBuilder string = new StringBuilder();
		
		for(int i=0; i<str.length; i++) {
		  string.append(str[i]);      
		  if(i%1==0 && i<str.length-1) {
		    string.append(",");
		  }
		}
		
		System.out.println(string);
	}
}
