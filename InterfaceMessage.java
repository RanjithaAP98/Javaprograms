package com.xworkz.interfaces;

public interface InterfaceMessage  extends INestedInterface  {

	@Override
	default void Message() {
		System.out.println("message");
	}
	
}
