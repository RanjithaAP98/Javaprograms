package com.xworkz.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	 public static void main(String args[]){ 
		  
		 //Java FileOutputStream is an output stream used for writing data to a file.
		  System.out.println("Create directory");
		  
         try {  
       	  
           FileOutputStream file = new FileOutputStream("C:\\FileIOExample\\CreateDirectory\\IOExample\\MyFile.txt");    
           file.write(65);    //write byte
           file.close();    
           System.out.println("success...");    
          }
         
          catch(FileNotFoundException e) {
 			e.printStackTrace();
 		  }catch(IOException e) {
 			e.printStackTrace();
 		}
         
 		System.out.println("Completed creating directory");
    } 
	  

}
