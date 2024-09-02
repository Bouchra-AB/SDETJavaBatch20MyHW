package org.example.e87;

public class E87ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Car'

        // Declare a String variable named 'carColor'
        // Declare an integer variable named 'carYear'
        // Declare a String variable named 'carMake'

        // Create the first object of the class 'Car'
        Car carOne = new Car();

        // Assign the value "Black" to the 'carColor' variable of the first object
        // Assign the value 2019 to the 'carYear' variable of the first object
        // Assign the value "BMW" to the 'carMake' variable of the first object

        carOne.carColor = "Black";
        carOne.carYear = 2019;
        carOne.carMake = "BMW";
        // Create the second object of the class 'Car'
        Car carTwo = new Car();

        // Assign the value "White" to the 'carColor' variable of the second object
        // Assign the value 2018 to the 'carYear' variable of the second object
        // Assign the value "Toyota" to the 'carMake' variable of the second object
        carTwo.carColor="White";
        carTwo.carYear=2018;
        carTwo.carMake="Toyota";
        // Print the values of the properties for both objects in the specified format
        System.out.println("Car color is "+carOne.carColor+ " and car year is "+carOne.carYear+" and car model is "+carOne.carMake);
        System.out.println("Car color is "+carTwo.carColor+ " and car year is "+carTwo.carYear+" and car model is "+carTwo.carMake);

    }
}
