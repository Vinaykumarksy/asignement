package org.example;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Printage {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String vin = scn.next();
        int age = scn.nextInt();;
      //  int vin2 = age++;
        System.out.println("whats your name:"+" " + vin);
        System.out.println("how old are you:"+" "+ age);
        System.out.println("Hello,"+ vin+" Next year, you'll be"+" "+ ++age);

        //System.out.print(age);





    }

    }




