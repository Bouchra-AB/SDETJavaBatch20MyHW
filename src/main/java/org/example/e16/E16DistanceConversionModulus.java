package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {
        // Declare the int variable and assign a value

        int totalMeters = 1850;
        int kilometers, meters;

        // Calculate kilometers and meters

        kilometers = totalMeters / 1000;
        meters = totalMeters % 1000;


        // Print the results

        System.out.println(totalMeters + " meters is equal to " + kilometers + " kilometers and " + meters + " meters.");

    }
}
