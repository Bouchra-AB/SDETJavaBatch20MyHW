package org.example.e39;
import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        int marks;
        char grade = ' ';
        // Print prompt for user to enter their mark
        // Capture the mark input
        System.out.println("Please enter your mark");
        marks = input.nextInt();
        // Determine the grade based on the mark
        if (marks <= 0 || marks > 100){
            System.out.println("Please enter valid mark");
        }else if (marks >= 1 && marks <= 25){
            grade = 'F';
        } else if (marks >= 26 && marks <= 45) {
            grade = 'E';
        } else if (marks >= 46 && marks <= 50) {
            grade = 'D';
        } else if (marks >= 51 && marks <= 60) {
            grade = 'C';
        } else if (marks >= 61 && marks <= 80) {
            grade = 'B';
        }else {
            grade = 'A';
        }
        // Print the grade   // Output: Your grade is ____
        if (marks >= 1 && marks <= 100){
            System.out.println("Your grade is " + grade);
        }
    }
}
