package com.ranjitha.javaprograms;

public class LoopBreak {
	public static void main(String[] args) {
		// The break statement can  be used to jump out of a loop.

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
			}
	}
}
