package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        System.out.println("First Number: ");
        double firstNum = scan.nextDouble();
        System.out.println("second Number: ");
        double secondNum = scan.nextDouble();
        double sum = firstNum+secondNum;
        System.out.println(sum);
        System.out.println("Dou want to continue: yes/No");
        String answer = scan.next();
        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer,please re-enter(yes/no):");
            answer= scan.next();
        }
        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Enter two numbers: ");
            System.out.println("First Number: ");
            firstNum = scan.nextDouble();
            System.out.println("second Number: ");
            secondNum = scan.nextDouble();
            sum = firstNum+secondNum;
            System.out.println(sum);
            System.out.println("Dou want to continue: yes/No");
            answer = scan.next();
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("thank you join us");
        }


    }
}
