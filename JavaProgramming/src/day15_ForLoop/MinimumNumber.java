package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        /*
                Write a program that ask the user to enter a number for 5 times.return the max number.
         */
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <6 ; i++) {
            System.out.println("Enter a number: ");
            int userNum = scanner.nextInt();
            if(i ==1 ){
                min=userNum;
                System.out.println("The minimum number is: "+min);
            }else if(userNum<min){
                min=userNum;
                System.out.println("The minimum number is: " + min);
            }else
                System.out.println("The minimum number is still: "+min);


        }
    }
}
