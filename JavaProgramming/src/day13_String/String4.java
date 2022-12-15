package day13_String;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message
    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
         */
        System.out.println("username:");
        String username = input.nextLine();
        System.out.println("password:");
        String passWord = input.nextLine();

        if(username.equals(username) && passWord.equals(passWord)){
            System.out.println("Logged in.");
        }else{
            System.err.println("Incorrect username or password");
        }
    }
}
