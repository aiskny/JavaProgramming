package day22_MultiDiemontialArrays;

public class OddNumbers {
    public static void main(String[] args) {
        /*create a method that can print odd numbers between 1~100 in a
same line saperated by space
         */
        int[] numbers = new int[100];
        int number = 0;
        /*for (int i = 1; i <numbers.length ; i++) {
            number++;
            System.out.print(number+" ");
        }
        */

        for (int i = 0; i < numbers.length; i++) {
            number++;
            if (number%2!=0) {
                System.out.print(number + " ");
            }
        }
    }
}
