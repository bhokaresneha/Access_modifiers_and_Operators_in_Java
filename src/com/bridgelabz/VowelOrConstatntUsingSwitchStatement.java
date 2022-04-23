/*Problem  Statement=>
Programs with Switch Statement
1. Write a Program to Check Vowel or Consonant
 */

package com.bridgelabz;

import java.util.Scanner;
public class VowelOrConstatntUsingSwitchStatement
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'e':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'i':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'o':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'u':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'A':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'E':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'I':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'O':
                System.out.println(ch + " is  a Vowel");
                break;

            case 'U':
                System.out.println(ch + " is  a Vowel");
                break;

            default:
                System.out.println(ch+" is a Consonant");


        }
    }
}