package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println(num+ " is Even Number");
        }
        else {
            System.out.println(num+ " is Odd Number");
        }
    }
}
