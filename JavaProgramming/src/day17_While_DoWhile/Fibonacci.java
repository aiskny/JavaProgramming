package day17_While_DoWhile;

public class Fibonacci {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int newNumber = 0;
        for (int i=num1+num2 ;i>0; i++) {
            newNumber = num1+num2;

            System.out.println(i);

        }
    }
}
