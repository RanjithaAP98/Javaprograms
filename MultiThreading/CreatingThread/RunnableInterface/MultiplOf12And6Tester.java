package com.xworkz.multithreading.runnableinterface;

public class MultiplOf12And6Tester {

	public static void main(String[] args) {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
		MultiplOf6 multiplOf6 = new MultiplOf6();
		Thread t1 = new Thread(multiplOf6);
		t1.start();
		
		MultiplOf12 multiplOf12 = new MultiplOf12();
		Thread t2 = new Thread(multiplOf12);
		t2.start();
		
		//Annonymous class
		Runnable multiplOf18 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread details are: " + Thread.currentThread().getId() + 
						" Name: "+ Thread.currentThread().getName());
				
				int num = 18;
				for(int i=1; i<=10; i++) {
					System.out.println(num + " * " + i + " = " +(num*i));
				}
				
				System.out.println("End od Thread: " + Thread.currentThread().getId() + 
						" Name: "+ Thread.currentThread().getName());
					
			}	
		};
		
		Thread t3 = new Thread(multiplOf18);
		t3.start();
		
		//Lambdha Expression
				Runnable multiplOf24 = () -> {

						System.out.println("Thread details are: " + Thread.currentThread().getId() + 
								" Name: "+ Thread.currentThread().getName());
						
						int num = 24;
						for(int i=1; i<=10; i++) {
							System.out.println(num + " * " + i + " = " +(num*i));
						}
						
						System.out.println("End od Thread: " + Thread.currentThread().getId() + 
								" Name: "+ Thread.currentThread().getName());
								
				};
				
				Thread t4 = new Thread(multiplOf24);
				t4.start();
				
		
		System.out.println("End od Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
	}

}
