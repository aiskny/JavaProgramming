package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter our first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Enter our second number: ");
        int secondNum = scan.nextInt();
        System.out.println("Enter a maths operator: ");
        char operator = scan.next().charAt(0);
        while(!(operator=='+'||operator=='-')){
            System.err.println("Invalid operator,Please re-enter:");
            operator = scan.next().charAt(0);
        }if((operator=='+'||operator=='-')){
            System.out.println((operator=='+')?(firstNum+secondNum):(firstNum-secondNum));

        }
    }
}
