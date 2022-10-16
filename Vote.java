package com.bridgelabz;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.print("Enter Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >=18) {
            System.out.println("You can vote");
        }else{
            System.out.println("You can't vote");
        }
    }
}
