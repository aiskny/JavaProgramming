package day35_Encapsulation;

public class Person {
    public String name,language;
    public int age;
    public char gender;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;
    public static String planet;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
    static {
        isHuman=true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead= 1;
        planet = "Earth";
    }
    public static void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+ " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language =" + language +
                ", planet =" + planet +
                '}';
    }
}
