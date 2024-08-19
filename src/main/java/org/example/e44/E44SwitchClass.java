package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        int mealType;
        double costs = 0.0;

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        // Capture the meal type input
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        mealType = input.nextInt();
        // Print the price
        // Output: The price of your meal is $____
        switch (mealType){
            case 1:
                costs = 5.00;
                break;
            case 2:
                costs = 10.00;
                break;
            case 3:
                costs = 15.00;
                break;
            default:
                System.out.println("Invalid meal type entered");
                break;
        }
        // Print the price
        if (mealType >= 1 && mealType <=3){
            System.out.println("The price of your meal is $" + costs);
        }
    }
}