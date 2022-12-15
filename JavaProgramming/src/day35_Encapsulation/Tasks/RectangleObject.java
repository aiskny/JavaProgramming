package Encapsulation.Tasks;

public class RectangleObject {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5,3.5);
        System.out.println(rectangle);
        rectangle.setWidth(-1);
        rectangle.setLength(-2);
    }
}
