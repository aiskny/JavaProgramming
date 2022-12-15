package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius){
        this.radius = radius;
        //pi = 3.14; it is not efficient way initializing a static variable in the instance constructor
    }

    static {
      //  radius = 5; I can not assign an instance variable in a static block
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
    ///I can also use the main method to assign the variables
  /*public static void main(String[] args) {
    pi = 3.14;
    name = "Circle";

    numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    System.out.println("pi = " + pi);
    System.out.println("name = " + name);
    System.out.println("numbers = " + numbers);
}
*/
    
}
