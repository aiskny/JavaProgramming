package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
        Note: Pay attention to the example output
         */
        System.out.println("Enter your name: ");
        String Name = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println(Name + " " + lastName);

        char chn = Name.charAt(0);
        char chLn = lastName.charAt(0);

        System.out.println(chn + "." + chLn);
    }
}