package day36_Inheritance.Tasks;

public class StudentObjects {
    public static void main(String[] args) {
Student student1 = new Student("Ayse",100,'A','A',"Cydeo");
        System.out.println(student1);
        student1.setGender('F');
        student1.setAge(40);
        System.out.println(student1);
    }
}
