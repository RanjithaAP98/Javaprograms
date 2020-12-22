package com.ranjitha.javaprograms;

public class LoopBCinWhileloop {
	public static void main(String[] args) {
		
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		} 
		//Continue Statement
		System.out.println("Continue statement");
		int j = 0;
		while (j < 10) {
		  if (j == 4) {
		    j++;
		    continue;
		  }
		  System.out.println(j);
		  j++;
		}

}
}