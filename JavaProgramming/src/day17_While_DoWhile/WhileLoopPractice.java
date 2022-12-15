package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //username:"Cydeo"
        //password: "Cydeo123"
        Scanner scan = new Scanner(System.in);
        System.out.println("User Name:");
        String userName = scan.nextLine();
        System.out.println("Password: ");
        int numberOfAttempt =3;
        String password = scan.nextLine();
        if(userName.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("You are logged in");
            while(!((userName.equals("Cydeo") || password.equals("Cydeo123"))) && numberOfAttempt<=3){
                System.out.println("Your user name or password are wrong, please re-enter:");
                System.out.println("User Name:");
                 userName = scan.nextLine();
                System.out.println("Password: ");
                 password = scan.nextLine();
            }
            if(numberOfAttempt>4){
                System.out.println("your account is blocked,sorry!");
            }

        }

    }
}
