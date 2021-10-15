package objectsclasses;


	import com.inventory.list.Car;
	/**
	 * Create the Main Java Class and Create a Car object
	 * 
	 */
	public class mCar {

	    public static void main(final String[] args) {
	        // Create Class -Class name matches Filename
	        // PSVM method required to run this as an application
	        // starting point for the desktop application.
	        
	        // Make a Car object based on a Car class
	       Car car1 = new Car();
	     //car1.setMake("Ford");
	       
	       System.out.println("Count of objects = " + (Car.count));

	       Car car2 = new Car("Chevy", "Corvette", "red", 2020, "23050.99");
	      
	       /* System.out.println("Car2 Make:" + car2.getMake());
	       System.out.println("Car2 Model:" + car2.getModel());
	       System.out.println("Car2 Color:" + car2.getColor());
	       System.out.println("Car2 Price:" + car2.getPrice()); */
	       System.out.println("Car 2:" + car2);
	       
	       System.out.println("Car1 make:" + car1.getMake());
	       System.out.println("Count of objects = " + (Car.count));

	    }
	}

	    
