package day16_ForLoopStringPractise;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Enter your username:");
            String u = scan.nextLine();
            System.out.println("enter your password");
            String p = scan.nextLine();
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("You are logged in!");
                break;
            }
            if (!(u == "Cydeo" && p == "Cydeo123")) {
                System.out.println("wrong credential, please re-enter you have " + (3 - i) + " right");
            }

            if (i == 3) {
                System.out.println("you are blocked!You have " + (3 - i) + " right!");
                break;
            }

        }

    }
}
