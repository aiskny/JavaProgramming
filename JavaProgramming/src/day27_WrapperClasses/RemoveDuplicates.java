package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 22, 3, 3, 4, 5, 6};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
        System.out.println("------------------------------------");

        double[] arr2={1.5,1.5,1.5,3.5};
        double[] result2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(result2));

        System.out.println("---------------------------------------");

        String[] arr3 = {"Ayse","Ayse","Ali"};
        String[] result3 = removeDuplicates(arr3);
        System.out.println(Arrays.toString(result3));

        System.out.println("---------------------------");
        char[] arr4 = {'a','b','c','c'};
        char[] result4 = removeDuplicates(arr4);
        System.out.println(Arrays.toString(result4));
    }

    /*
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter == 1) {

                }
            }

        }
        return result;
    }
    */

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}