package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractSpecialCharacters {
    public static void main(String[] args) {
        //create a program that can extract the special characters, digits and stores them into separate ArrayList of characters
        String str = "ABCD123$%@&456EFG!";

        ArrayList<Character>chars = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character>letters = new ArrayList<>(chars);
        System.out.println("chars = " + chars);
       letters.removeIf(p->!Character.isLetter(p));
        System.out.println("letters = " + letters);
        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("digits = " + digits);
        ArrayList<Character> specialChar = new ArrayList<>(chars);
        //specialChar.removeIf(p->Character.isLetterOrDigit(p));
        specialChar.removeAll(letters);//2.solution
        specialChar.removeAll(digits);
        System.out.println("specialChar = " + specialChar);
        

    }
}
