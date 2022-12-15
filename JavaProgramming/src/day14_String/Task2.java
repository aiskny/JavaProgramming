package day14_String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        ask the user to enter a word. if the word ends with "ly", print "really???" ,
         otherwise, print "never mind"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        input.close();
        boolean endsWith = word.endsWith("ly");
        if(endsWith){
            System.out.println("really???");
        }else
            System.out.println("never mind");

        }
    }

