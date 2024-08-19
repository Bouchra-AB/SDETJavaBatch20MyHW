package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        String gender;
        int age;
        // Print prompt for user to enter gender
        // Capture the gender input
        System.out.println("Please enter your gender: M or F");
        gender = input.next();
        // Print prompt for user to enter age
        // Capture the age input
        System.out.println("Please enter your age");
        age = input.nextInt();
        // Classify based on gender and age
        if (age > 25){
            if (gender.equalsIgnoreCase("F")){
                System.out.println("Woman");
            }else {
                System.out.println("Man");
            }
        }else {
            if (gender.equalsIgnoreCase("F")){
                System.out.println("Girl");
            }else {
                System.out.println("Boy");
            }
        }
    }
}
