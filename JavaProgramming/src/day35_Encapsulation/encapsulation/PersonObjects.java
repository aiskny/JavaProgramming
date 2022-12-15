package Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {


        Person p1 = new Person();
    /*person1.name = "ayse";
    person1.age = 40;*/
        //i do not direct access to them because they are private data
        // Which function has to ability to set name,age?

        p1.setName("Ayse");
        p1.setAge(-40);//this value get terminetes the program

        System.out.println(p1.getName()+" : " +p1.getAge());
        //to get print the data(name and age ) we need to get method
    }
}