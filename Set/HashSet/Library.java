package com.xworkz.collectionconcept.set;

public class Library {
	
	private int bookid;  
	private String bookname;
	
	public Library(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Library [bookid=" + bookid + ", bookname=" + bookname + "]";
	}
	
}
