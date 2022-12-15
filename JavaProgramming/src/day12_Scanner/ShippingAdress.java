package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String building =input.next();
        input.nextLine();


        System.out.println("enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.next();

        System.out.println("Enter your state: ");
        String state=input.next();

        input.nextLine();

        System.out.println("Enter your post code: ");
        String postCode = input.nextLine();

        System.out.println(fullName);
        System.out.print(building);
        System.out.print("\t"+streetName);
        System.out.print("\t"+cityName);
        System.out.println("\n"+state+", ");
        System.out.print(postCode);
        input.close();
    }
}
