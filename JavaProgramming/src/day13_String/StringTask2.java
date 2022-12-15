package day13_String;

import java.util.Scanner;

public class StringTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        write a program that asks the user enter a three letter word.
        Check if the middle character of the given word is 'a'.
        In the case it is print: "Cool word",
        but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */
        System.out.println("Enter a three letter word: ");
        String str = input.nextLine();
        input.close();
        boolean coolWord = str.length() == 3 && str.charAt(str.length() / 2) == 'a';


       // if (coolWord) {
         //   System.out.println("Cool Word");
        //}
        boolean okeyWord = str.length() == 3 && str.charAt(str.length() / 2) != 'a';
       // if (okeyWord) {
           // System.out.println("Okey Word");
        //}
        boolean shortWord = str.length() < 3;
      //  if (shortWord) {
          //  System.out.println("Word is too short");
       // }
        boolean tooLongWord = str.length() > 3;
        //if (tooLongWord) {
        //    System.out.println("Word is too long");
       // }
        String result =  (coolWord)?("Cool Word"):(okeyWord)?("okeyWord"):(shortWord)?("Word is too short"):("Word is too long");
        System.out.println(result);
    }
}
