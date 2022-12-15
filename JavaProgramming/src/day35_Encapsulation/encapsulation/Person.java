package Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){// generating the getter method
        return age;
    }
    public void setAge(int age){//generating the setter method
        if (age<=0 || age>150){
            System.err.println("Invalid age: "+age);
            System.exit(0);
        }
        this.age = age;
    }
}
