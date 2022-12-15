package day13_String;

import java.util.Scanner;

public class Day_13_TaskQuestions {
    public static void main(String[] args) {
        /*write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
         */
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter a Sentence :");
        String sentence =input.next();
        System.out.println("sentence = " + sentence);
        char first = sentence.charAt(0);
        System.out.println("first character of sentence = " + first);
        int length =sentence.length();
        char last = sentence.charAt(length -1);
        System.out.println("last character of sentence = " + last);*/

        /* write a program that asks user to enter two strings, and print out the longest string
         */
        System.out.println("Enter first string");
        String first1 =input.nextLine();

        System.out.println("enter second string");
        String second = input.nextLine();

        if(first1.length()>second.length()){
            System.out.println( first1);
        }else
            System.out.println(second);


    }
}
