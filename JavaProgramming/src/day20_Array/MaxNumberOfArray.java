package day20_Array;

import java.util.Scanner;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0];
        /*numbers.forr gives reverse
        for (int i = numbers.length - 1; i >= 0; i--) {   
        }
        */
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i]>max){
               max = numbers[i];
           }
        }
        System.out.println("max = " + max);

        
    }
}
