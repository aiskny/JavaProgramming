package day33_Static.Tasks;

public class Test_Person {
    public static void main(String[] args) {
       Person person1 = new Person("Ayse",40,'F');
       Person person2 = new Person("Ali",40,'M');
       person1.eat("kebab");
       person2.eat("kebab");
       person1.drink("cola");
       person2.drink("tea");
        System.out.println(person1.numberOfHead);
        System.out.println(person1.numberOfEyes);
        System.out.println(person1.isHuman);
        System.out.println(person1.hasNose);
        System.out.println(person1.hasWings);
    }
}
