package day23_CustomMethod;

import java.util.Scanner;

public class ReverseArrayVeryImportant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str =new String[10];
        System.out.println("Enter your words please:");
         String word =str[0];

        for (int i = 0; i <str.length ; i++) {
            str[i] = scan.nextLine();
            word = str[i];
            String reverse = "";
            for (int j =word.length()-1; j>=0 ; j--) {
                reverse +=word.charAt(j);
            }
            System.out.println(reverse);
        }

    }
}
