package day14_String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Ask user to enter two words. Print first word without its first character 
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
         */
        System.out.println("Enter two words");
        System.out.println("First Word:");
        String firstWord = input.nextLine();
        System.out.println("firstWord = " + firstWord);
        System.out.println("Second Word:");
        String secondWord = input.nextLine();
        System.out.println("secondWord = " + secondWord);
        String firstWord1=firstWord.substring(1);
        String secondWord2 = secondWord.substring(1);
        System.out.println(firstWord1+secondWord2);



    }
}

