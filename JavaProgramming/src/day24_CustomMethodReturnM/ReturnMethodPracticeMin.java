package day24_CustomMethodReturnM;

public class ReturnMethodPracticeMin {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,0,-2};
        int min = min(numbers);
        System.out.println(min);
    }
    //Create a method that can return the min number from an array of integers
    public static int min(int[] numbers){
        int min = numbers[0];
        for (int eachNumber : numbers) {
            if (eachNumber<min){
                min = eachNumber;
            }

        }
        return min;
    }
}
