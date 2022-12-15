package day38_Inheritance.carTask;

public class Car {
    public String brand,model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }
    public void start(){

    }
    public void drive(){

    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
/*
    public void fly(){

    }
    fly method is not common for all cars, and parent class it should only contain the common features all subclasses.
     */
}
