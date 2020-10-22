package com.xworkz.interfaces;

public interface InterfaceShowable extends INestedInterface {

	@Override
	default void show() {
		System.out.println("Show");
	}
}
