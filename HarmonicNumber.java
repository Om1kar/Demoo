package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth Harmonic Number");
        int num;
        num = sc.nextInt();
        double result = 0.0;

        while (num > 0) {
            result = result + (double) 1 / num;
            num--;
            System.out.println("Nth Harmonic Number is " + result);

        }
    }
}
