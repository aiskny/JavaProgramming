package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("age : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("full name: ");
        String fullName = input.nextLine();

        input.close();

        System.out.println("enter your GPA: ");
        double gpa = input.nextDouble();
        input.nextLine();
        System.out.println("Enter yor school name: ");
        String schoolName = input.nextLine();

        System.out.println("age is "+age);
        System.out.println("full name "+fullName);
        System.out.println("school name: "+schoolName);



    }
}
