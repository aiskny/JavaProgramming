package day13_String;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner("System.in");
        String s1= new String("Java");
        String s2= new String("Java");
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);

        String name= "wooden spoon";
        name=name.toUpperCase();
        System.out.println(name);
    }

}
