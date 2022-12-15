package day13_String;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String str1 = input.nextLine();
        System.out.println("Enter second word: ");
        String str2 = input.nextLine();
        System.out.println("Enter third word: ");
        String str3 = input.nextLine();
        input.close();
        if(str1.length()==str2.length() && str2.length()==str3.length()){
            System.out.println("All words are same length");

        }else if(str1.length()!=str2.length() && str1.length()!=str3.length() && str2.length() !=str3.length()){
            System.out.println("All different length");

        }else{
        System.out.println("Not Same nor Different lengths");
    }

        /*
         Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
            else if(str1.length()!=str2.length() || str1.length()!=str3.length() || str2.length() !=str3.length() ){
            System.out.println("Not Same nor Different lengths");
         */

    }
}
