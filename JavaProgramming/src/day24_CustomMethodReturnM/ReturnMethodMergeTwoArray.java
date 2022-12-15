package day24_CustomMethodReturnM;

import java.util.Arrays;

public class ReturnMethodMergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,1,4,5,6};
        int[] merged = mergedArray(arr1,arr2);
        System.out.println(Arrays.toString(merged));


    }
    //Create  a method that can merge two arrays and return the new array
    public static int[] mergedArray(int[] arr1,int[] arr2){
        int[] merged = new int[arr1.length+arr2.length];
        int i = 0;
        for (int each : arr1) {
            merged[i++]=each;
        }
        for (int each : arr2) {
            merged[i++]=each;
        }
        return merged;
        }
    }
