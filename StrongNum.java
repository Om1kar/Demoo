package com.bridgelabz;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = scan.nextInt();
        int fact = 1, rem, sum = 0, flag = sum;
        rem = num % 10;
        for (int i = 1; i <= rem; i++) {
            fact = fact * i;
            num = num / 10;
            sum = sum + fact;
        }
        if (flag == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

}
