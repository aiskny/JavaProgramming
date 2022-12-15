package day14_String;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
        HINT: 1. you need charAt() method
              2. Ascii Table
         */
        System.out.println("Enter a word:");
        String word = input.next();
        input.close();
        char digit = word.charAt(0);
        if(48 <= digit && digit<= 57 ) {
            System.out.println("first character is digit");
         } else if (65<= digit && digit <=90) {
        System.out.println(word.substring(0,1).toLowerCase()+word.substring(1));
        }else if (97<= digit && digit <=122){
            System.out.println(word.substring(0,1).toUpperCase()+word.substring(1));

        }else
            System.out.println("first character is special character: "+word.charAt(0));
    }
}
