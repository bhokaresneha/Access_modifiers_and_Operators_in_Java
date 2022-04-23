/*
Problem Statement=>
2. Write a program SpringSeason.java that takes two int values m and d from the command line and prints true if day d of month m is between March 20 (m = 3, d=20)
 and June 20 (m = 6, d = 20), false otherwise.

* */
package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day");
        int day   = sc.nextInt();
        System.out.println("Enter Month");
        int month = sc.nextInt();

        boolean Spring =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(Spring);
    }
}

