package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word please: ");
        String word = scanner.next();
        int frequency = 0;
        for (int i = 0; i < word.length(); i++) {
            char eachChar = word.charAt(i);

            if (word.charAt(0)==eachChar) {
                frequency++;
            }
            if(word.charAt(1)==eachChar){
                frequency++;
            }
        }
        System.out.println(" first character's frequency is  = " + frequency);
        System.out.println(" second character's frequency is  = " + frequency);
    }
}
