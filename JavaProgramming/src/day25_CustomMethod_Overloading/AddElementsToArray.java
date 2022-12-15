package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
    int[] arr1 = {1,2,3,4};
    int[] arr = addElement(arr1,5);
        System.out.println(Arrays.toString(arr));
        double[] arr2 = {1.2,3.5,0.4,7.9,0.5};
       double[] arrD =  addElement(arr2,0.2);
        System.out.println(Arrays.toString(arrD));
        String[] arr3 = {"Ayse","Ali","Betul","Merve","Ahsen"};
        String[] addS = addElement(arr3,"Annem");
        System.out.println(Arrays.toString(addS));
        char[] arr4={'a','b','c'};
        char[] chars = addElement(arr4,'d');
        System.out.println(Arrays.toString(chars));


    }
    //1.create a return method called addInteger that can add an integer after the last index
    public static int[] addElement(int[] array ,int element){
        int[] result = new int[array.length+1];
        int i =0;
        for (int each : array) {
            result[i++]=each;
        }
        result[i] = element;
        return result;
    }
    //2.create a return method called addDouble that can add a Double after the last index
    public static double[] addElement(double[] array ,double element){
        double[] result = new double[array.length+1];
        int i = 0;
        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
    }
    //3.create a return method called addString that can add an String after the last index
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length+1];
        int i = 0;
        for (String each : array) {
            result[i++]=each;
        }
        result[i]=element;
        return result;
        }
    //4.create a return method called addChar that can add a char after the last index
    public static char[] addElement(char[] array,char element){
        char[] result = new char[array.length+1];
        int i = 0;
            for (char each : array) {
                result[i++]=each;
            }
            result[i]=element;
            return result;
        }
    }
