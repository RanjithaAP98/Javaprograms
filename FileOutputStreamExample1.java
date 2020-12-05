package com.xworkz.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample1 {
	
	 public static void main(String args[]){  
		 
		 System.out.println("Create directory");
		 
         try {   
        	 
           FileOutputStream file = new FileOutputStream("C:\\FileIOExample\\CreateDirectory\\IOExample\\MyFile.txt");  
           
           String s = "Hello World";  //write string
           
           byte b[]=s.getBytes();//converting string into byte array  
           
           file.write(b);    
           file.close();  
           
           System.out.println("success...");   
         }
          catch(FileNotFoundException e) {
  			e.printStackTrace();
  		  }
         catch(IOException e) {
  			e.printStackTrace();
  		}
          
  		System.out.println("Completed creating directory");
    }    

}
