package june;

public class Vehicle {
	//parent class
		  protected String brand = "Ford";        // Vehicle attribute
		  public void horn() {                    // Vehicle method
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Car extends Vehicle {
		  private String modelName = "Mustang";    // Car attribute
		  public static void main(String[] args) {

		    // Create a myCar object
		    Car myCar = new Car();

		    // Call the honk() method (from the Vehicle class) on the myCar object
		    myCar.horn();

		    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
		    System.out.println(myCar.brand + " " + myCar.modelName);
		  }
		}

