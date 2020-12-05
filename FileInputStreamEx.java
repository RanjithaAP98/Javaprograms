package com.xworkz.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	
	public static void main(String[] args) {
		
		System.out.println("Create directory");
		File file=new File("C:\\FileIOExample\\CreateDirectory\\IOExample\\MyFile.txt");
		
		try {
			FileInputStream in=new FileInputStream(file);
			
			byte[] inputmsg=new byte[20];
			in.read(inputmsg);
			
			for(byte b:inputmsg)
			{
				System.out.print((char)b);
			
			}
			in.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n Completed creating directory");
		
	}

}
