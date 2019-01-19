package d_constuctor_reference;


@FunctionalInterface
interface Car1 { 
    BMWCar1 getCar();    
}

class BMWCar1 {
	  public void printCar() {         
        System.out.println("BMW CAR !!!"); 
    }
}
 
public class Sample {	
	 public static void main(String[] args) { 
		 
		 
		 // 1st way		        
		        Car1 c1 = new Car1() {	 
		            @Override
		            public BMWCar1 getCar() {
		                return new BMWCar1();
		            }	 
		        };	 
		        c1.getCar().printCar();
		  
		 // with lambda
			 
			        Car1 c2 = () -> new BMWCar1();
			        c2.getCar().printCar();
			 
		   
		 // constructor reference
		 
		    Car1 c3 = BMWCar1::new; 
		    
		    c3.getCar().printCar(); 
	    } 
	 
	 }