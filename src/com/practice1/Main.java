package com.practice1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Reading inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal:");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate:");
        double annualInterestRate = scanner.nextDouble()/1200;

        System.out.println("Period (Years):");
        int period = scanner.nextInt() * 12;

        double repeatedExpression = Math.pow((1 + annualInterestRate), (period));
        double mortgageAmount = principal * ((annualInterestRate * repeatedExpression)/(repeatedExpression - 1));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgageAmount);
        // Printing result
        System.out.println("Mortgage: " + result);
    }
}