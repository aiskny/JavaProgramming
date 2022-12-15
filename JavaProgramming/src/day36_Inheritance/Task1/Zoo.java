package day36_Inheritance.Task1;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'F',2,"small","white");
        dog.eat();
        dog.bark();
        dog.drink();
        dog.move();
        dog.sleep();
        
        Cat cat = new Cat();
    }
}
