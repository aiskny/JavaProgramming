package day15_ForLoop;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        System.out.println(word.replace('x','a').replace('X','a'));
    }
}
