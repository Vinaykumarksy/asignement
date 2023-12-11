package org.example;

import java.util.Scanner;

public class Retirement {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" how much money need for retirement");
        int Principal = scn.nextInt();
       // System.out.print("How much money will you contribute every year");

        int Intrest = scn.nextInt();

        int time = scn.nextInt();
        int Retirement = Principal * Intrest * time / 100;

        System.out.println("Retirment amount"+Retirement);
    }
}
