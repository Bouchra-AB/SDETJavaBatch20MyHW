package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        int coffeeType;
        double costs = 0.0;
        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        // Capture the coffee type input
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        coffeeType = input.nextInt();

        switch (coffeeType){
            case 1:
                costs = 3.00;
                break;
            case 2:
                costs = 4.00;
                break;
            case 3:
                costs = 4.50;
                break;
            case 4:
                costs = 5.00;
                break;
            default:
                System.out.println("Invalid coffee type entered");
        }
        // Print the price    // Output: The price of your coffee is $____
        if (coffeeType >= 1 && coffeeType <= 4){
            System.out.println("The price of your coffee is $" + costs);
        }
    }
}
