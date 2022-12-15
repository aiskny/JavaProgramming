package day20_Array;

public class MinMaxNumbers {
    public static void main(String[] args) {
        int[] numbers = {12,11,6,18,20};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max =numbers[i];
            }
            if (numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        
    }
}
