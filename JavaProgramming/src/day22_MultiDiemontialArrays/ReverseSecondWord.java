package day22_MultiDiemontialArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence = "I love Java";
        String[] word = sentence.split(" ");
        String wordRevers = word[1];
        String reverse = "";

        for (int i = wordRevers.length() - 1; i >= 0; i--) {
            reverse += wordRevers.charAt(i);
        }
        word[1]=reverse;
        System.out.println(Arrays.toString(word));
        for (String each : word) {
            System.out.print(each+" ");
        }
    }

}
