package day35_Encapsulation;

public class Test_Person {
    public static void main(String[] args) {
        Person person1 = new Person("Ayse","Turkish",40,'F');
        Person person2 = new Person("Betul","English",12,'F');
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        person1.drink("tea");
        person2.drink("Cola");
        person1.eat("Kebab");
        person2.eat("Cholote");
        System.out.println(person1.isHuman);
        System.out.println(person2.isHuman);
        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);
        System.out.println(person1.numberOfWings);
        System.out.println(person2.numberOfWings);


    }
}
