package Encapsulation.Tasks;

public class Circle {
    private double radius;
    public static double pi;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calPerimeter(){
        return radius*2*pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi =" + pi +
                ", Area =" + calcArea() +
                ", perimeter =" + calPerimeter() +
                '}';
    }
}
