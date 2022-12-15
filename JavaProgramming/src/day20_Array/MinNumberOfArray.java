package day20_Array;

public class MinNumberOfArray {
    public static void main(String[] args) {
        int[] numbers = {12,11,6,40,41};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}
