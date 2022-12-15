package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);//this is the way of calling the static variable in the different class
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        /*
        0.0
       null
       null
       they will be printed as above because variables can run in the main method in the same class but not in a different class
         */
       /* When we use the static blok we will get these result, I do not have to call it
       3.14
       Circle
       [10, 20]

        */

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("-----------------------------");
        //find the sum of 10,20


        //find the sum of 100,200
    }
}
