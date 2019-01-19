package supplier;

import java.util.function.Supplier;

public class SupplierDemo2 { 
	 
	public static void main(String[] args) {
		
		  //Using Lambda expression
		  driveVehicle(()-> new Vehicle());
		  driveVehicle(()-> new Car());
		  driveVehicle(()-> new Bike());
		   
		  //Using method ref
//		  driveVehicle(Vehicle::new);
//		  driveVehicle(Car::new);
//		  driveVehicle(Bike::new);
		}
	

	  static void driveVehicle(Supplier<? extends Vehicle> supplier){
	    Vehicle vehicle = supplier.get();
	    vehicle.drive();   
	  }
}

class Vehicle{
		  public void drive(){ 
		    System.out.println("Driving vehicle ...");
		  }
		}
class Car extends Vehicle{
		  @Override
		  public void drive(){
		    System.out.println("Driving car...");
		  }
		}
class Bike extends Vehicle{
	  @Override
	  public void drive(){
	    System.out.println("Driving bike...");
	  }
	}

