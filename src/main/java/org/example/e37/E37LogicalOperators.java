package org.example.e37;
import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        boolean isThirsty, isSleepy;
        String drink;
        // Print prompt for user to answer if they are thirsty
        // Capture the thirsty input
        System.out.println("Are you thirsty? (true/false)");
        isThirsty = input.nextBoolean();
        // Print prompt for user to answer if they are sleepy
        // Capture the sleepy input
        System.out.println("Are you sleepy? (true/false)");
        isSleepy = input.nextBoolean();
        // Determine the drink based on the inputs
        if (isThirsty && !isSleepy){
            drink = "water";
        } else if (isThirsty && isSleepy) {
            drink = "coffee";
        } else if (!isThirsty && isSleepy) {
            drink = "tea";
        }else {
            drink = "nothing";
        }
        // Print the drink suggestion
        // Output: Looks like you need to drink ___
        System.out.println("Looks like you need to drink " + drink);
    }
}
