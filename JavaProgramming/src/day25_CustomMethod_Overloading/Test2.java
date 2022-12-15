package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        ArraysUtility.printEach(arr1);
        System.out.println("-----------------");
        double[] arr2={1.3,5.6,7.9};
        ArraysUtility.printEach(arr2);
        System.out.println("-------------");
        char[] arr3 ={'a'};
        ArraysUtility.printEach(arr3);
        System.out.println("--------------");
        String[] str = {"Ayse","Ali"};
        ArraysUtility.printEach(str);
        System.out.println("--------------------");
        int[] arr5= {1,2,3,4,5};
       int min= ArraysUtility.minNumber(arr5);
        System.out.println(min);
        double[] arr6={1.2,5.6,7.9};
        ArraysUtility.printTheMaxNumber(arr6);
        int[] array = {1,2,3,4,5,6,7};
        int number = 4;
       boolean r1 = ArraysUtility.contains(array,number);
        System.out.println(r1);

    }
}
