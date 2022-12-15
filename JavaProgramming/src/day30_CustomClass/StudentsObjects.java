package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');
        Student student2 = new Student();
        student2.setInfo("hulya", 'F', 26, 2123, 'A');
        Student student3 = new Student();
        student3.setInfo("Elminur", 'F', 26, 2210, 'A');
        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 28, 5511, 'B');
        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26, 2252, 'C');
        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();//grade A
        ArrayList<Student> angryBirds = new ArrayList<>();
      // ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(students));
        //we can use the array for the loop
        for (Student each : students) {
            if (each.grade=='A'){
                earlyBirds.add(each);
            }else {
                angryBirds.add(each);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);
    }
}
