package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class OverloadingPractice {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6,7};
        int[] array = merge2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(array));
        double[] arrD1={1.2,2.3,3.5};
        double[] arrD2={4.3,5.1,6.4,7.9};
        double[] arrayD = merge2Arrays(arrD1,arrD2);
        System.out.println(Arrays.toString(arrayD));
        char[] arrC1={'c','a'};
        char[] arrC2={'b'};
        char[] arrayC = merge2Arrays(arrC1,arrC2);
        Arrays.sort(arrayC);
        System.out.println(Arrays.toString(arrayC));
        String[] arrS1={"Ayse","Ali"};
        String[] arrS2={"Betul","Merve","Ahsen"};
        String[] arrayS = merge2Arrays(arrS1,arrS2);
        Arrays.sort(arrayS);
        System.out.println(Arrays.toString(arrayS));



    }
    //create a method that can merge two int arrays
    public static int[] merge2Arrays(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length+arr2.length];
        int i =0 ;
        for (int each1 : arr1) {
            result[i++] =each1;
        }
        for (int each2 : arr2) {
            result[i++]=each2;
        }
        return result;
    }

    //create a method that can merge two double arrays
    public static double[] merge2Arrays(double[] arr1,double[] arr2){
        double[] result = new double[arr1.length+arr2.length];
        int i =0 ;
        for (double each1 : arr1) {
            result[i++] =each1;
        }
        for (double each2 : arr2) {
            result[i++]=each2;
        }
        return result;
    }

    //create a method that can merge two char arrays
    public static char[] merge2Arrays(char[] arr1,char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        int i = 0;
        for (char each1 : arr1) {
            result[i++] = each1;
        }
        for (char each2 : arr2) {
            result[i++] = each2;
        }
        return result;
    }
    //create a method that can merge two String arrays
    public static String[] merge2Arrays(String[] arr1,String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        int i = 0;
        for (String each1 : arr1) {
            result[i++] = each1;
        }
        for (String each2 : arr2) {
            result[i++] = each2;
        }
        return result;
    }
}
