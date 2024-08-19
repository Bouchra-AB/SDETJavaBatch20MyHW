package org.example.e38;
import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        boolean isWeekend, isAvailable;
        String subject = "";
        // Print prompt for user to answer if it is the weekend
        // Capture the weekend input
        System.out.println("Is it weekend? (true/false)");
        isWeekend = input.nextBoolean();
        System.out.println("Are you available? (true/false)");
        isAvailable = input.nextBoolean();
        // Determine the subject based on the input
        // If it is the weekend
        //    Set subject to "Java"
        // Otherwise
        //    Set subject to "manual testing"
        if (isWeekend && isAvailable){
            subject = "Java";
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else if (!isAvailable) {
            subject = "no subject";
        }
        // Print the subject suggestion
        // Output: Today you will be learning ____
        System.out.println("Today you will be learning " + subject);
    }
}

