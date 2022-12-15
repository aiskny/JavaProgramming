package day15_ForLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String firstName = new Scanner(System.in).nextLine();
        String lastName = new Scanner(System.in).nextLine();

       firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

       lastName= (""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+lastName);




    }
}
