package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();
        if (u.equals("Cydeo") && p.equals("Cydeo123")) {//if credentials are valid
            System.out.println("Logged in");
        } else {
            int attempts = 2;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                if (attempts==1){
                    System.out.println("this is your last chance");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password: ");
                p = scan.next();
                attempts--;
            }
        }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
            }else{
                    System.out.println("your account is blocked!");
                }
            scan.close();
            }
        }