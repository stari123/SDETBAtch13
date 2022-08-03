package W3;
public class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println ( "Tuut, tuut!" );
    }
}
class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute

    public static void main(String[] args) {
        Car myCar = new Car (); // Create a myCar object
        myCar.honk (); // Call the honk() method (from the Vehicle class) on the myCar object

        System.out.println ( myCar.brand + " " + myCar.modelName );  // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    }
}
