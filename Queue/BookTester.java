package com.xworkz.collectionconcept.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class BookTester {

	public static void main(String[] args) {
		
		 //Creating Books  
		Book b1 = new Book("Let us C", "Yashwant Kanetkar", 8);  
	    Book b2 = new Book("Operating System", "Galvin", 6);  
	    Book b3 = new Book("Data Communications & Networking", "Forouzan", 4);  
	    Book b4 = new Book("Design Patterns" , "Richard Helm" , 5);
		
		PriorityQueue<Book> book = new PriorityQueue<Book>(); 
		
		//Adding Books to the book  
	    book.add(b1);  
	    book.add(b2);  
	    book.add(b3);  
	    
	    System.out.println(book);
	    
	    //Traversing book elements using Iterator
	    System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Book> bkItr =  book.iterator();
		while(bkItr.hasNext())
			System.out.println(bkItr.next());
		
		//offer() method
		book.offer(b4);
		System.out.println();
		System.out.println(book);
		
		//element() method
		System.out.println();
		System.out.println("element of book:" +book.element());
		
		//peek() method
		System.out.println();
		System.out.println("peek of first element:" + book.peek()); 
		
		//poll() method
		System.out.println();
		System.out.println("poll of first element:" + book.poll());
		System.out.println(book); 
		
		//Remove
		book.remove();
		System.out.println();
		System.out.println(book);	

	}

}
