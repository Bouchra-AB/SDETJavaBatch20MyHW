package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values

        int totalSlices = 13;
        int friends = 4;
        int slicesPerPerson, leftoverSlices;

        // Calculate slices per person

        slicesPerPerson = totalSlices / friends;
        leftoverSlices = totalSlices % friends;

        // Print the results

        System.out.println("Each person gets " + slicesPerPerson + " slices.");
        System.out.println("There are " + leftoverSlices + " slices left over.");

    }
}
