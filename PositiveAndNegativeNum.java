package com.bridgelabz;

import java.util.Scanner;

public class PositiveAndNegativeNum {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            System.out.println(num+" is Positive Number");
        } else if (num<0) {
            System.out.println(num+" is Negative Number");

        }
        else {
            System.out.println("Zero");
        }
    }
}
