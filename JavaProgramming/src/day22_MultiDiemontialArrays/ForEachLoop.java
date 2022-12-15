package day22_MultiDiemontialArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3,},{4,5,6,7,8},{9,10,11,12,13}};
        for (int[] each1Darray : arr2D) {
            for (int elements : each1Darray) {

                System.out.print(elements+" ");
            }
            System.out.println();
        }
    }
}
