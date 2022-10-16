package com.bridgelabz;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers--");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Select Operation");
        System.out.println("1. Addition " + " 2.Subtraction " + " 3.Multiplication " + " 4.Division " + " 5.exit ");
        ch = sc.nextInt();

        if (ch == 1) {
            System.out.println("Addition=" + (num1 + num2));
        } else if (ch == 2) {
            System.out.println("Subtraction=" + (num1 - num2));
        } else if (ch == 3) {
            System.out.println("Multiplication=" + (num1 * num2));
        } else if (ch == 4) {
            System.out.println("Division=" + (num1 / num2));
        } else {
            System.out.println("Exit");

        }
    }
}
