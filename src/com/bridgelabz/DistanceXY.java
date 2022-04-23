/*Problem Statement=>
Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
* */
package com.bridgelabz;

import java.util.Scanner;
public class DistanceXY
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of x");
        double x=sc.nextFloat();
        System.out.println("enter the value of y");
        double y=sc.nextFloat();

        double dist1 = Math.pow(x,2);
        double dist2 = Math.pow(y,2);
        double dist =  Math.sqrt(dist1 + dist2 );

        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }
}
