package com.xworkz.filehandling;

import java.io.File;

public class CreateDirectory {
	
public static void main(String[] args) {
		
		System.out.println("Create directory");
		
		File file=new File("C:\\FileIOExample\\CreateDirectory\\IOExample");
		file.mkdirs();
		
		System.out.println("Completed creating directory");
	}

}
