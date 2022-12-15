package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        /*
         Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

         */
        double PI = 3.14;
        double radius = 4.8;//radius=4.8cm
        double area = radius * radius * PI;
        double 	Perimeter = 2 * radius * PI;

        System.out.println("radius = " + radius+"cm");
        System.out.println("Perimeter = " + Perimeter+"cm");
        System.out.println("area = " + area+"cm²");






    }
}
