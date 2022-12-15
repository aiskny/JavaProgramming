package day19_LoopRecap;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is Even Number.");
            } else {
                System.out.println(number + " is Odd Number.");
            }
            System.out.println("Would you like to enter another number?(yes/no)");
            String answer = scan.next().toLowerCase();
            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Your answer is invalid!");
                System.exit(0);
            }

            while (answer.equals("yes")) {
                System.out.println("Enter a number:");
                number = scan.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " is Even Number.");
                } else {
                    System.out.println(number + " is Odd Number.");
                }
                System.out.println("Would you like to enter another number?");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using the calculator.");
                break;
            }
        }
    }
}



