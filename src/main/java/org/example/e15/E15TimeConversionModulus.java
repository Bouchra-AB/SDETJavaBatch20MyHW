package org.example.e15;

public class E15TimeConversionModulus {
    public static void main(String[] args) {

        // Declare the int variable and assign a value

        int totalMinutes = 125;
        int hours, minutes;

        // Calculate hours and minutes

        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;


        // Print the results

        System.out.println(totalMinutes + " minutes is equal to " + hours + " hours and " + minutes + " minutes.");
    }
}
