package io.javabrains.unit1;

public class Greeter {
	
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting();	
		Greeting lamdaGreeting = () -> System.out.println("Hello World Lambda...!");
		
		Greeting innerClassGreeting = new  Greeting() {
			
			@Override
			public void perform() {
				System.out.println("Hello World Inner...!");
			}
		};
		/*helloWorldGreeting.perform();
		lamdaGreeting.perform();
		innerClassGreeting.perform();*/
		greeter.greet(lamdaGreeting);
		greeter.greet(innerClassGreeting);
		
	}

}
