package com.bridgelabz;

import java.util.Scanner;

public class SumOfFirstNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num*(num+1)/2);

    }
}
