package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, max;
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        // Capture the three numbers input
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        // Use nested if-else statements to find the largest number
        if (num1 > num2){
            if (num1 > num3){
                max = num1;
            }else {
                max = num3;
            }
        }else{
            if(num2 > num3){
                max = num2;
            }else {
                max = num3;
            }
        }
        System.out.println("The largest number is " + max);
    }
}
