package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your first number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();

            System.out.println("Addition:" + (num1 + num2));

            System.out.println("Would you like to continue?(yes/no)");
            String answer = scan.next().toLowerCase();
            while (!((answer.equals("yes") || (answer.equals("no"))))) {
                System.out.println("Invalid answer,please re-enter(yes/no)");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }

        }
    }
}
