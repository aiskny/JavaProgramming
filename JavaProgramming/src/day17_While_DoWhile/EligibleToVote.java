package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        while (!(age>=18 && age <=120)){
            System.out.println("Invalid age,please re-enter: ");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid answer,please enter yes or no:");
            answer = scan.next();
            }

            if((answer.equalsIgnoreCase("yes"))&&( age>=18 && age <=120)){
                System.out.println("you are eligible to vote");
            }else {
                System.out.println("you are not eligible to vote");

            }

        }



    }

