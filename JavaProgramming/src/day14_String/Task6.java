package day14_String;

import java.util.Scanner;

public class Task6 {
            public static void main(String[] args) {
                Scanner  scan = new Scanner(System.in);
                System.out.println("Please enter a word");
                String word = scan.nextLine();
                char digit = word.charAt(0);
                char first = word.charAt(0);
                if (48 <= digit && digit <= 57) {
                    System.out.println("first character is digit");
                } else if (65 <= first && first <= 90) {
                    System.out.println(word.substring(0,1).toLowerCase() + word.substring(1));
                }else if (first>=97 && first<=122){
                    System.out.println(word.substring(0,1).toUpperCase() + word.substring(1));
                }else if (first>=33 && first<=47 || first<=64 && first >=58 || first <= 96 && first >= 91 || first<= 126 && first >= 123){
                    System.out.println("first character is special character");
                }
    }
}
