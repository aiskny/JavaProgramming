package day24_CustomMethodReturnM;

import java.util.Arrays;

public class ReturnMethodReverseTheArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
      int[]  reversed = reversedArray(numbers);
        System.out.println(Arrays.toString(reversed));
    }
    //Create a method that can return the reversed array
    public static int[] reversedArray(int[] numbers){
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length-1,j=0; i >=0; i--,j++) {
            reversed[i] = numbers[j];
        }
        return reversed;
    }
}
