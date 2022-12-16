package day39_Recap.areaOfShapes;

public class Rectangle extends Shapes {
    private double width,length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("Invalid width: "+width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0) {
            System.err.println("Invalid width: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public Rectangle( double width, double length) {
        super("Rectangle");
        setLength(length);
        setWidth(width);

    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", perimeter=" + perimeter() +
                ", area=" + area() +
                '}';
    }
}
