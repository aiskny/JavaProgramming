package day13_String;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String word = input.nextLine();
        input.close();

        if(word.length()==0){
            System.out.println("String is empty.");
        }else if (word.length()>3) {
            char ch3 = word.charAt(word.length()-1);
            char ch2 = word.charAt(word.length()-2);
            char ch1 = word.charAt(word.length()-3);
            System.out.println(""+ch1+ch2+ch3);
        }else if (word.length()<=3) {
            System.out.println(word);
        }

    }
}
