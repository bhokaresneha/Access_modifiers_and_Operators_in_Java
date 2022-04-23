/*Problem Statements=>
*If Else Statement Problems
1. Read a single Digit Number and write in word

* */


package com.bridgelabz;

import java.util.Scanner;
public class DigitIntoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No ");
        int num = sc.nextInt();
        if(num == 0 ){
            System.out.println("You Entered zero");
        }
        else if (num == 1) {
            System.out.println("You Entered one");
        } else if (num == 2) {
            System.out.println("You Entered Two");
        }
        else if (num == 3) {
            System.out.println("You Entered Three");
        } else if (num == 4) {
            System.out.println("You Entered Four");
        } else if (num == 5) {
            System.out.println("You Entered Five");
        } else if (num == 6) {
            System.out.println("You Entered Six");
        } else if (num == 7) {
            System.out.println("You Entered Seven");
        } else if (num == 8) {
            System.out.println("You Entered Eight");
        }  else if (num == 9) {
            System.out.println("You Entered Nine");
        }
        else {
            System.out.println("Enter Valid No");
        }

    }

    public static class ValueOfDigits
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter No ");
            int num = sc.nextInt();
            if(num == 1 )
            {
                System.out.println("You Entered One Unit");
            } else if (num == 10)
                {
                System.out.println("You Entered Ten Unit");
                } else if (num == 100)
                    {
                        System.out.println("You Entered Hundred Unit");
                    } else if (num == 1000)
                        {
                            System.out.println("You Entered Thousand Unit");
                        } else if (num == 10000)
                            {
                                System.out.println("You Entered Ten Thousand Unit ");
                            } else
                                {
                                     System.out.println("Enter Valid No Unit ");
                                }

        }

        public static class DisplayMonthNameUsingSwitchStatement
        {
            public static void main(String[] arg)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a Month: ");
                int month= sc.nextInt();
                switch (month) {
                    case 1:
                        System.out.println(" Month is : January ");
                        break;

                    case 2:
                        System.out.println(" Month is : February ");
                        break;

                    case 3:
                        System.out.println(" Month is : March ");
                        break;

                    case 4:
                        System.out.println(" Month is : April ");
                        break;

                    case 5:
                        System.out.println(" Month is : May ");
                        break;

                    case 6:
                        System.out.println(" Month is : June ");
                        break;

                    case 7:
                        System.out.println(" Month is : July ");
                        break;

                    case 8:
                        System.out.println(" Month is : August ");
                        break;

                    case 9:
                        System.out.println(" Month is : September");
                        break;

                    case 10:
                        System.out.println(" Month is : October");
                        break;

                    case 11:
                        System.out.println(" Month is : November ");
                        break;
                    case 12:
                        System.out.println(" Month is : December ");
                        break;

                    default:
                        System.out.println("Invalid input! Please enter Valid Month ");


                }
            }
        }
    }
}
