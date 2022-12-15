package day22_MultiDiemontialArrays;

public class Task2EvenNumbers {
    public static void main(String[] args) {
        int[] evenNumbers = new int[50];
        int number = -1;
        for (int i = 0; i < evenNumbers.length; i++) {
            number++;
           if (number%2==0){
               System.out.print(number+" ");
           }

        }
    }
}
