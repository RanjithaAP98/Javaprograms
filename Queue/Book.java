package com.xworkz.collectionconcept.queue;

public class Book implements Comparable<Book>{
	
	private String name;  
	private String author;  
	private int quantity;
	
	public Book(String name, String author, int quantity) {
		super();
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(Book o) {
		int result = this.quantity - o.quantity ;
		return result;
	} 

}
