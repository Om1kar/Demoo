package com.bridgelabz;

public class PallinDrome {
    public static void main(String[] args) {
        int number = 303;
    int reverse = 0;
    int original = 0;
    original = number;
        while (number > 0) {
        reverse = reverse * 10 + number %10;
        number = number / 10;

    }
        System.out.println("Reverse NUmber:" + reverse);
        if (original == reverse)
            System.out.println("Number is Palindrome :" + original);
        else
                System.out.println("Number is not Palindrome : " + original);
}
}
