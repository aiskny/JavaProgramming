package day33_Static;

public class StudentObjects {
    public static void main(String[] args) {
      Student student1 = new Student("Ayse",'F',40,1,'A');
      Student student2 = new Student("Ali",'M');
        Student student3 = new Student("Ali",2);
        Student student4 = new Student("Ali",2,'A');
        Student student5 = new Student("Ali",'M',40);
        Student student6= new Student("Ali",'M',40,2);
        Student student7 = new Student("Ali",'M',40,'A');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student1==student2);
    }
}
