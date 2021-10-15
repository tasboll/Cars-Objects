package objectsclasses;
import java.math.BigDecimal;
public class Car {

	
	
	public static int count = 0;

	private String make;
	private String model;
	private String color;
	private int year;
	private BigDecimal price;


	public Car () {
	    this.make = "Undefined";
	    this.model = "Undefined";
	    this.color = "Undefined";
	    this.price = new BigDecimal(0);
	    count++;
	    
	}
	public Car (String make, String model, String color, String price){
	    this.color = color;
	    this.make = make;
	    this.model = model;
	    this.price = new BigDecimal(price);
	    count++;
	}


	public void setMake(String make) {
	    this.make = make;

	}
	public String getMake() {
	    return this.make;
	}

	public String getModel(){
	    return model;
	}
	public void setModel(String model) {
	    this.model = model;
	}
	public String getColor(){
	    return color;
	}
	public void setColor(String color) {
	    this.color = color;
	}
	public BigDecimal getPrice() {
	    return price;
	}
	public int getYear() {
	    return year;
	}

	public void setYear(int year) {
	    this.year = year;
	}

	public Car(String make, String model, String color, int year, String price) {
	    this.make = make;
	    this.model = model;
	    this.color = color;
	    this.year = year;
	    this.price = new BigDecimal(price);
	    count++;
	}

	@Override
	public String toString() {
	    return "Car [color=" + color + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year + "]";
	}

}
