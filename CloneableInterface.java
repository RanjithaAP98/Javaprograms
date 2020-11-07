package com.xworkz.typesinfunctionalinterface;

import java.lang.Cloneable;

public class CloneableInterface  implements Cloneable {
	
	String str;
	String str1;
	
	public CloneableInterface( String str, String str1) {
	
		this.str = str;
		this.str1 = str1;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();	
	}
	
}
