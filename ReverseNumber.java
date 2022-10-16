package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int reverse=0;
        System.out.println("Enter any Number");
        num=sc.nextInt();
        while(num!=0) {
            int Remainder = num % 10;
            reverse = reverse *10 + Remainder;
            num = num/10;
        }
        System.out.println("Reversed number is " +reverse);
    }
}
