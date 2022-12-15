package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class OverloadingReversearray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 45, 4};
      int[] reversed = reverse(array);
        System.out.println(Arrays.toString(reversed));

        double[] dArray = {0.2,1.3,3.4};
        double[] reverseD = reverse(dArray);
        System.out.println(Arrays.toString(reverseD));

        char[] cArray = {'a','e','k'};
        char[] reversedC = reverse(cArray);
        System.out.println(Arrays.toString(reversedC));

        String[] sArray = {"Ayse","Ali"};
        String[] reversedS = reverse(sArray);
        System.out.println(Arrays.toString(reversedS));
    }
    //create a method that can reverse an integer array
    public static int[] reverse(int[] array){
       int[] reversed = new int[array.length];
        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {
            reversed[j]=array[i];
        }
      return reversed;
    }
    //create a method that can reverse a double array
    public static double[] reverse(double[] array){
        double[] reversed = new double[array.length];
        for (int i = array.length-1, j=0; i>=0 ; i--,j++) {
            reversed[j] = array[i];
        }
        return reversed;
    }
    //create a method that can reverse a char array
    public static char[] reverse(char[] array){
        char[] reversed = new char[array.length];
        for (int i = array.length-1, j=0; i>=0 ; i--,j++) {
            reversed[j] =array[i];
        }
        return reversed;
    }
    //create a method that can reverse a String array
    public static String[] reverse(String[] array){
        String[] reversed = new String[array.length];
        for (int i = array.length-1,j=0; i>=0 ; i--,j++) {
            reversed[j]=array[i];
        }
        return reversed;
    }
}
