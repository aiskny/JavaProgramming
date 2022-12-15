package day24_CustomMethodReturnM;

public class ReturnMethodPracticeMax {
    public static void main(String[] args) {
        int[] numbers={10,20,40,80,70,5};
        int max = max(numbers);
        System.out.println(max
        );
    }
    //Create a method that can return the max number from an array of integers
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int eachNumber : numbers) {
            if (eachNumber>max){
                max=eachNumber;
            }

        }
        return max;
    }
}
