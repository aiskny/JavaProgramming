package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?Yes/No");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("Invalid Answer,please re-enter(yes/no)");
            answer = scan.next().toLowerCase();
            }
        if(answer.equals("yes")){
            System.out.println("Congrats!");
        }else{
            System.out.println("Goodbye");
        }
    }
}
