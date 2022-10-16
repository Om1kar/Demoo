package com.bridgelabz;

import java.util.Scanner;

public class ArmstrongNum {
    static void CheckArmstrongNumber(int num) {
        int arm = 0, rem, c;
        c = num;
        while (num > 0) {
            rem = num % 10;
            arm = (rem * rem * rem) + arm;
            num = num / 10;
        }
        if (c == arm)
            System.out.println(" Armstrong Number");
        else
            System.out.println(" Not Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        CheckArmstrongNumber(n);
    }
}
