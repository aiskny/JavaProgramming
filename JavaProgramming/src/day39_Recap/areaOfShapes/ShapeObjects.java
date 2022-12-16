package day39_Recap.areaOfShapes;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square= new Square(10);
        System.out.println(square);
       // System.out.println(square);
        //can i access the side of the sequare directly?
       // square.side = 20;
       //side is private  i can access through the getter and setter
        //getter and setter are the only way, those blocks has some additional condition you have to obey
        //otherwise i can give any data
        square.setSide(15);
        System.out.println(square);
        System.out.println("-------------------------");
        Rectangle rectangle= new Rectangle(5,6);
        System.out.println(rectangle);
        rectangle.setLength(10);//i can change the length
        System.out.println(rectangle.getLength());// i can check the value
        System.out.println(rectangle);
        //System.out.println(rectangle.name);
        //name was private therefore i can not access directly so i need to use getter and setter
        System.out.println(rectangle.getName());
        System.out.println("---------------------------");
        Circle circle = new Circle(7.5);
        System.out.println(circle);
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());
    }

}
