package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reverse = reverse(array);
        System.out.println(Arrays.toString(reverse));
    }
    //reverse the given array, returns a new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        for ( int i = array.length-1,j = 0;i >=0 ;j++,i--) {
            result[j]=array[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static double[] reverse(double[] array){
       double[] result = new double[array.length];
        for ( int i = array.length-1,j = 0;i >=0 ;j++,i--) {
            result[j]=array[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];
        for ( int i = array.length-1,j = 0;i >=0 ;j++,i--) {
            result[j]=array[i];
        }
        return result;
    }

    //reverse the given array, returns a new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];
        for ( int i = array.length-1,j = 0;i >=0 ;j++,i--) {
            result[j]=array[i];
        }
        return result;
    }
}
