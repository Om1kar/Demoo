package com.bridgelabz;

import java.util.Scanner;

public class PrimeNum {
    static void checkPrimeNum(int num) {

        for (int i = 2; i < num; i++) {
            if (num % 1 == 0) {
                break;
            } else {
                System.out.println("Not a Prime Number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
      checkPrimeNum(num);
    }
}









