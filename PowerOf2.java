package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i=1;
        int power = 1;
        System.out.println("Enter the power until you want to calculate");
        num = sc.nextInt();

        while(i<=num) {
            power = power * 2;
            i++;
            System.out.println("values of powers = "+power);
        }
    }
}
