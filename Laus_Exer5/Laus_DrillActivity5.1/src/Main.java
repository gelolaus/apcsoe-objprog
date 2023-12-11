/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 11, 2023 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the loan amount (P): ");
        double P = userInput.nextDouble();

        System.out.print("Enter the number of years to pay (n): ");
        int n = userInput.nextInt();

        System.out.print("Enter the number of payments per year (x): ");
        int x = userInput.nextInt();

        System.out.print("Enter the interest rate (i): ");
        double i = userInput.nextDouble();

        double monthlyInterestRate = i / x;
        int totalPayments = n * x;
        double R = P * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        System.out.printf("%-14s%-14s%-20s%-15s%-19s%-20s\n", "Payment Year", "Payment #", "Beginning Balance", "Amortization", "Incurred Interest", "Ending Balance");

        double beginningBalance = P;
        for (int year = 1; year <= n; year++) {
            for (int paymentNumber = 1; paymentNumber <= x; paymentNumber++) {
                double incurredInterest = beginningBalance * monthlyInterestRate;
                double endingBalance = beginningBalance - R + incurredInterest;

                System.out.printf("%-14d%-14d%-20.2f%-15.4f%-19.2f%-20.2f\n", year, (paymentNumber + (year - 1) * x),
                        beginningBalance, R, incurredInterest, endingBalance);

                beginningBalance = endingBalance;
            }
        }

        /*
        * Why did I use printf?
        * Better formatting and easier to manage since there are multiple values to loop through
        *
        * Why did I use %-14s%-14s%-20s%-15s%-19s%-20s?
        * I actually used ChatGPT to get these values because I wanted to perfectly align the table, here's what I learned:
        * The purpose of -14d and -14s (or any number in replacement of 14) is to align the output to the left
        * The d is used for integers (decimals), the s is used for strings
        */

    }
}