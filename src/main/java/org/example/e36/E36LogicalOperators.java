package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        int rentExpense, foodExpense, transportationExpense, entertainmentExpense;

        // Print prompt for user to enter their monthly rent expense
        // Capture the rent expense input
        System.out.println("Please enter your monthly rent expense");
        rentExpense = input.nextInt();

        // Print prompt for user to enter their monthly food expense
        // Capture the food expense input
        System.out.println("Please enter your monthly food expense");
        foodExpense = input.nextInt();

        // Print prompt for user to enter their monthly transportation expense
        // Capture the transportation expense input
        System.out.println("Please enter your monthly transportation expense");
        transportationExpense = input.nextInt();

        // Print prompt for user to enter their monthly entertainment expense
        // Capture the entertainment expense input
        System.out.println("Please enter your monthly entertainment expense");
        entertainmentExpense = input.nextInt();

        //Analyze Expenses
        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense){
            System.out.println("You are prioritizing essentials well.");
        } else if (rentExpense > foodExpense || transportationExpense > entertainmentExpense ) {
            System.out.println("You are on the right track, but could improve.");
        } else if (!(rentExpense > foodExpense) && !(transportationExpense > entertainmentExpense)) {
            System.out.println("You need to rethink your spending priorities.");
        }

    }
}
