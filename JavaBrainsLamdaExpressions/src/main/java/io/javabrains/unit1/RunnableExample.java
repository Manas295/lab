package io.javabrains.unit1;
/*
 * This works because Runnable has a single method . If it had more than one method , you could not have written a lambda function
 * of that type
 * 
 */

public class RunnableExample {

	public static void main(String[] args) {

		Thread  thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed Inside Runnable");
				
			}
		});
		thread.run();
	
	// Giving Inline Lamda Definition instead of a anonymous class
		Thread mylambdaThread = new Thread(()-> System.out.println("Printed Inside Lamda Runnable"));
		mylambdaThread.run();
	
	}

}
