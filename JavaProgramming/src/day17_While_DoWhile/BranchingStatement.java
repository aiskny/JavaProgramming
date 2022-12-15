package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {
        for(char i = 'A';i <='Z';i++){
            if(i=='F'){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        for (int i = -1; i <0; i--) {
            System.out.println(i);
            if(i== -40){
                break;
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------");

        while(true){
            Scanner scan = new Scanner(System.in);
            //System.out.println("Enter your username:");
        }

    }
}
