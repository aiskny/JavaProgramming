package day14_String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
         */
        System.out.println("Enter a word");
        String word = input.next();
        boolean x = word.startsWith("x");

        if(x){
            System.out.println(word.substring(1));
        }
    }
}
