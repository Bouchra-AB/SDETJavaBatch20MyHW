package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense = 19.50;
        double afternoonExpense = 29.35;
        double eveningExpense = 27.40;
        double totalExpense, budget;
        // Calculate total expense
        totalExpense = morningExpense + afternoonExpense + eveningExpense;
        // Define a budget
        budget = 100.0;
        // Check if within budget
        System.out.println("Your total daily expense is: " + totalExpense);
        if(totalExpense <= budget)
        {
            System.out.println("You are within the budget.");
        }
        else
        {
            System.out.println("You are over the budget.");
        }
    }
}
