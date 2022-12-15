package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        /*
        Write a program that ask the user to enter a number for 5 times.return the max number.
         */
        int max = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int userNum = input.nextInt();
            if (i == 1) {
                max = userNum;
                System.out.println("The max number is:" + max);
            } else if (userNum>max) {
                max = userNum;
                System.out.println("the max number is: " +max);
            } else
                System.out.println("The max number is still: " + max);
        }

        }
      }
          



