package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students = {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[] earlyBird = Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBird));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
      numbers = Arrays.copyOf(numbers,6);
        System.out.println(Arrays.toString(numbers));
        System.out.println("----------------------------------------------------");
        char[] ch1 = {'A','B','C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] scores2 = Arrays.copyOfRange(scores,3,7+1);
        System.out.println(Arrays.toString(scores2));

        int[] scores3 = Arrays.copyOfRange(scores,4,scores.length);
        System.out.println(Arrays.toString(scores3));



    }
}
