package org.example;
import java.util.*;
public class Retirement_Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money will you contribute every year? ");
        double currentBalance = scanner.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRatePercentage = scanner.nextDouble();
        double interestRate = interestRatePercentage / 100;

        double newBalance = calculateNewBalance(currentBalance, interestRate);

        System.out.println("After year 1, your balance is "+newBalance);
        System.out.print("Are you ready to retire? (y/n)");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Congratulations! Enjoy.");
        } else {
            System.out.println("Keep Rocking");
        }
    }

    private static double calculateNewBalance(double currentBalance, double interestRate) {
        return currentBalance * (1 + interestRate);
    }

}
