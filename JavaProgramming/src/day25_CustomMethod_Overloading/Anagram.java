package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String  str1 = "Ayse";
        String str2 = "Esya";

        char[] c1 = str1.toLowerCase().toCharArray();
        Arrays.sort(c1);
        char[] c2 = str2.toLowerCase().toCharArray();
        Arrays.sort(c2);
        if (Arrays.equals(c1,c2)){
            System.out.println(str1 +" and "+str2+" are anagram words.");
        }else{
            System.out.println("They are not");
        }
    }
}
