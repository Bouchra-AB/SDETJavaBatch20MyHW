package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };

        // Declare an array to store the sums of each row
        int[] sums = new int[a.length];
        int sum;

        // Use nested loops to iterate through the 2D array and calculate the sum of each row
        // Store the sums in the new array
        for (int i = 0; i < a.length; i++){
            sum = 0;
            for (int j = 0; j < a[i].length; j++){
                sum += a[i][j];
            }
            sums[i] = sum;
        }

        // Print the values of the new array
        for (int num : sums){
            System.out.println(num);
        }
    }
}
