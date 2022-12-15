package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class OverLoadingPractice2 {
    public static void main(String[] args) {
        int[] array = {10,20,40,5,70,100};
        int max = maxNumber(array);
        System.out.println(max);
      double[] arrayD = {10.1,20.3,40.1,500.2,70.1,100.0};
       double maxD = maxNumber(arrayD);
        System.out.println(maxD);

        long[] arrayL = {9L,2L,3L,4L};
        long maxL = maxNumber(arrayL);
        System.out.println(maxL);

        short[] arraySh = {9666,22222,3345,32014};
        short maxShort = maxNumber(arraySh);
        System.out.println(maxShort);
        float[] fArray = {100000.3f,10000000.23f};
        float maxFloat = maxNumber(fArray);
        System.out.println((maxFloat));
        int[] barray = {-127,128,-120,};
        int bmax = maxNumber(barray);
        System.out.println(bmax);



    }
    //create a method can return the max number from an integer array
    public static int maxNumber(int[] array){
        int max = array[0];
        for (int each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    //create a method can return the max number from a double array
    public static double maxNumber(double[] array){
        double max = array[0];
        for (double each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }

    //create a method can return the max number from a long array
    public static long maxNumber(long[] array){
        long max = array[0];
        for (long each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }
    //create a method can return the max number from a short array
    public static short maxNumber(short[] array){
        short max = array[0];
        for (short each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }
    //create a method can return the max number from a float array
    public static float maxNumber(float[] array){
        float max = array[0];
        for (float each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }
    //create a method can return the max number from a byte array
    public static byte maxNumber(byte[] array){
        byte max = array[0];
        for (byte each : array) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }
}
