package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        for (char each : str.toCharArray()) {
            System.out.println(each);
        }
        //OR
        String str2 = "Java";
        char[] chars = str2.toCharArray();
        for (char eachChar : chars) {
            System.out.println(eachChar);
        }
        System.out.println("------------------------------------------------------------------");

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("-------------------------------------------------------------------");
        String email = "WoodenSpoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------------------------------");
        String s = "Today is nice day.Today is Monday.Today we learn Java";
        String[] sentences = s.split("\\.");// Double backward slash:\\
        System.out.println(Arrays.toString(sentences));
    }
}

