package day16_ForLoopStringPractise;

import java.util.Scanner;

public class LoggedIn2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = "a";
        String password = "b";

        for (int i = 1; i < 4; i++) {
            System.out.println("Enter your username:");
            String uName = scan.nextLine();
            System.out.println("Enter password:");
            String uPass = scan.nextLine();

            if ( userName.equals( uName) && password.equals( uPass)) {
                System.out.println("You are logged in!!!");
                break;
            } else {
                System.out.println("wrong credential");
            }
            if (i == 3) {
                System.out.println("you are blocked!");
                break;
            }
        }


    }
}
