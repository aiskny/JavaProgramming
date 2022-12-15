package day18_NestedLoop;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even Number ");
            }
            if (!(num % 2 == 0)) {
                System.out.println("Odd Number");
            }
            System.out.println("Would you like to enter another number");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid answer, please re-enter(yes/no):");
                answer=scan.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }
        }
    }
}
