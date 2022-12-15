package day18_NestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to
                        have three attempts to enter correct credentials and if all three attempts are failed,
                         then print "Your account is locked."
         */
        for (int i = 1; i <4 ; i++) {
            System.out.println("Enter your username:  ");
            String userName = scan.nextLine();
            System.out.println("Enter your password: ");
            String password = scan.nextLine();
            if (userName.equals("Cydeo") && password.equals("WoodenSpoon")){
                System.out.println("Logged in.");
                break;
            }
            if (!((userName.equals("Cydeo") && password.equals("WoodenSpoon")))){
                if ((3-i)>=1){
                    System.out.println("Wrong credentials, please re-enter, you have "+(3-i)+" attempt");
                }
            }
            if ((3-i)==0){
                System.out.println("Your account is locked.Please contact support team");
            }
        }
    }
}
