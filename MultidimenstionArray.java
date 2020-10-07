package com.xworkz.arrayexample;

public class MultidimenstionArray {
	public static void main(String args[]) {
	
	int[][] numarray = new int[2][2];
	
	numarray[0][0]=1;
	numarray[0][1]=2;
	numarray[1][0]=3;
	numarray[1][1]=4;
	
	System.out.println("[0][0]: "+numarray[0][0]);
	System.out.println("[0][1]: "+numarray[0][1]);
	System.out.println("[1][0]: "+numarray[1][0]);
	System.out.println("[1][1]: "+numarray[1][1]);
	
	for(int i=0;i<2;i++) //rows
	{
		for(int j=0; j<2; j++) {
			System.out.println(+numarray[i][j]);
		}
}
	
	
	for(int i=0;i<2;i++)
	{
		for(int j=0; j<2; j++) {
			System.out.print(+numarray[i][j] + "   ");
		}
		System.out.println();
       }	
     }	
  }