package com.bridgelabz;

import java.util.Scanner;

public class AutomorphicNumber {
    static void checkAutomorphicnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int square = num * num;
        int remainder = square % 10;
        if (remainder == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("not a Automorphic Number");
        }
    }
    public static void main(String[] args) {
        checkAutomorphicnum();
    }
}
