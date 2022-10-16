package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    static void toCheckAlphabetIsVowelOrConsonant(char ch){

        if (ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Entered Alphabet is a Vowel");
        else
            System.out.println("Entered Alphabet is a consonant");

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        char ch = sc.next().charAt(0);
        toCheckAlphabetIsVowelOrConsonant(ch);//Method calling

    }
}
