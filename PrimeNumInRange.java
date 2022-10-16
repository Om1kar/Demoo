package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumInRange {
    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.print(j + ",");
        }
    }
}
