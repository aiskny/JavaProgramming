package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';
         */
        ;// A to Z
        for (char i = 'A', j = 0; i <='Z' && j < letters.length ; i++,j++) {
           letters[j] = i;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-----------------------------------------------------");
        char[] alphabet = new char[26];
        char ch = 'Z';
        for (int i = 0; i<alphabet.length ; i++,ch--) {
            alphabet[i]=ch;
        }
        System.out.println(Arrays.toString(alphabet));
        System.out.println("-----------------------------------------------------------");
        for (char i = 'Z',j=0; i >='A'&& j<alphabet.length ; i--,j++) {
            alphabet[j]=i;
        }
        System.out.println(Arrays.toString(alphabet));
        System.out.println("-------------------------------------------------------------");
        int[] letters2 = new int[26];
        for (int i = 0 , j='Z'; i<letters2.length && j>='A' ; i++,j--  ) {
            letters2[i]=(char)j;
        }
        System.out.println(Arrays.toString(letters2));
        System.out.println("------------------------------------------------------------------");

        for (char i = 0,j = 'Z'; i <alphabet.length ; i++,j--) {
            alphabet[i] = j;
        }
        System.out.println(Arrays.toString(letters));
    }

}
