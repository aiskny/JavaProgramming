package day15_ForLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        if(word.startsWith("x")){
            System.out.println(word.replace('x','a'));
            /*if(word.charAt(0)=='x')
            word = word.replaceFirst("x","a")

             */
        }
    }
}
