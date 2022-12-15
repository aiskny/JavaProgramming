package day20_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Store the elements:10,20,50,70
        int[] numbers = {10,20,50,70};
        System.out.println(Arrays.toString(numbers));

        int[] myNumbers = new int[3];
        numbers [0] = 10;
        numbers [1] = 20;
        numbers [2] = 50;
        numbers [3] = 70;
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------------------------------------");

        //Create a variable that can contain 5 scores
        int[] scores = new int[5];
        scores [1] = 85;
        scores [scores.length-1] = 95;//this will give the last index of element
        scores [3] = 75;
        scores [0] = 65;
        scores [2] = 55;
        System.out.println(Arrays.toString(scores));
        System.out.println("------------------------------------------------------");
        String[] months ={"January","February","March"};
        /*System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[3]);*/
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i <months.length ; i++) {//i:represents the index numbers of array starting from 0
            System.out.println(months[i]);
            System.out.println("--------------------------------------------------------");
            for (int j = months.length-1; j >=0 ; j--) {
                System.out.println(months[j]);

            }


        }
    }

}
