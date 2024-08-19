package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        boolean needsLoan;
        int creditScore;
        String eligibility;
        // Print prompt for user to answer if they need a loan
        // Capture the loan requirement input
        System.out.println("Do you need a loan? (true/false)");
        needsLoan = input.nextBoolean();
        // Check if the user needs a loan
        if (needsLoan){
            System.out.println("What is your credit score?");
            creditScore = input.nextInt();
            if (creditScore < 600){
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <=800) {
                eligibility = "Eligible";
            } else {
                eligibility = "Definitely eligible";
            }
        }else {
            eligibility = "Unknown";
        }
        System.out.println("The eligibility is " + eligibility);
    }
}
