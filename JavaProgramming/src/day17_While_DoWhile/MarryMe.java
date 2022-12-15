package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?Yes/No ");
        String answer = scan.nextLine();
        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter(yes/no): ");
            answer = scan.nextLine();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats!");
        }else{
            System.out.println("Goodbye");
        }
    }
}
