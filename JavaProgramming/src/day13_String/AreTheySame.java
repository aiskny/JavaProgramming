package day13_String;

import java.util.Scanner;

public class AreTheySame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */
        System.out.println("Enter a word:");
        String word = input.nextLine();
        System.out.println("The word is: "+ word);
        char firstCh =word.charAt(0);
        int length =word.length();
        char lastCh = word.charAt(length-1);
       boolean same= firstCh==lastCh;
        System.out.println("First character and second character are same.");



    }
}
