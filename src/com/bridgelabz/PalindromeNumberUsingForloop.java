/*Problem  Statement=>
using for loop=
* 3.Write a Program to find Palindrome Number
eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.

* */

package com.bridgelabz;

import java.util.Scanner;
public class PalindromeNumberUsingForloop
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        int reverse=0, element, remainder;
        element = num;
        System.out.println(element);

        for( ;num!=0;)
        {
            remainder= num % 10;
            reverse = (reverse * 10) + remainder;
            num= num / 10;

        }

        if (element == reverse)
        {
            System.out.println("Yes, it is palindrome");
        }
        else{
            System.out.println("No, it is not palindrome");
        }
    }

    public static class SumOfNaturalNoUsingWhileloop
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n,sum=0;
            System.out.println("Enter the positive Integer ");
            n=sc.nextInt();
            int x=1;
            while(x <= n)
            {
                sum = sum + x;
                System.out.print(x+ "+");
                x++;
            }
            System.out.println();
            System.out.println("Sum Of Natural Numbers is =>"+sum);

        }

    }
}



