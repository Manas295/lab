package b_runnable; 


public class RunnableLambda {

	public static void main(String[] args) { 

		Runnable runnable = new Runnable() {			
			public void run() {
				for (int i = 0; i < 4; i++) {					
					System.out.println("From Thread [" +Thread.currentThread().getName() +" ] "+i);					
				}
			}
		};


		Runnable runnable2 = () -> {for (int i = 0; i < 4; i++) {					
			System.out.println("From Thread [" +Thread.currentThread().getName() +" ] "+i);					
		}};

		/*	Runnable runnable = () -> 
		                 { 
			              for (int i = 0; i < 4; i++) {			 
			                  System.out.println("From Thread [" +Thread.currentThread().getName() +" ] "+i);					
		                     }
		                 };*/



		new Thread(runnable,"my thread").start();

		}
}