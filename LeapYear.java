package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    static void checkLeapYearOrNot() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0)
            System.out.println(year + " is leap year");

        else if (year % 400 == 0)
            System.out.println(year + " is a leap year");

        else
            System.out.println("Not a Leap Year");
    }
    public static void main (String[]args){
            System.out.println("Enter Year");
            checkLeapYearOrNot();
        }
    }




