package day39_Recap.areaOfShapes;

public class Shapes {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shapes(String name) {
        this.name = name;
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }



    @Override //it is optional
    public String toString() {
        return "Shapes{" +
                "name='" + name + '\'' +
                ",area='" + area() + '\'' +
                ",perimeter='" + perimeter() + '\'' +
                '}';
    }
}
