package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");

        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            // using while loop

            while (num % i == 0) {
                num = num / i;

                System.out.println("Prime factors for the given number is-" + i);
            }
        }

    }
}
