/* Problem  Statement=>
using for loop=
* 1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

 * */

package com.bridgelabz;

import java .util.Scanner;
public class SumOfNatualNoUsingForloop {

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n,sum=0;
            System.out.println("Enter the positive Integer ");
            n=sc.nextInt();

            for (int x = 1; x <= n; x++)
            {
                sum = sum + x;
                System.out.print(x+ "+");
            }
            System.out.println("Sum Of Natural Numbers is =>"+sum);

        }
}
