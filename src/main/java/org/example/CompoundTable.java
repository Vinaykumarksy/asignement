package org.example;
import java.util.*;
public class CompoundTable {
    public static void main(String[] args) {
        // Interest rates
        double[] interestRates = {10, 11, 12, 13, 14, 15};
        // Number of periods
        int periods = 10;
        // Print the header row for the table
        for (double rate : interestRates) {
            System.out.printf(" %3.0f%%      | ", rate);
        }
        System.out.println();
        // Create a table of results
        double InterestRate=10000.00;
        for (double rate : interestRates) {
            System.out.printf("%9.2f | ", InterestRate);}
        System.out.println();
        for (int period = 1; period <periods; period++) {
            for (double rate : interestRates) {
                double result = compoundInterest(10000, rate, period);
                System.out.printf("%9.2f | ", result);
            }
            System.out.println();
        }
    }
    // Function to calculate compound interest
    private static double compoundInterest(double principal, double rate, int periods) {
        return principal * Math.pow(1 + rate / 100, periods);
    }

}
