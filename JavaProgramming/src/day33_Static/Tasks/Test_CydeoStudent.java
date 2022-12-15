package day33_Static.Tasks;

public class Test_CydeoStudent {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent1 = new CydeoStudent("Ali",40,'M',1,'A',4,10);
        CydeoStudent cydeoStudent2 = new CydeoStudent("Ayse",40,'F',2,'A',10,17);
        System.out.println(cydeoStudent1);
        System.out.println(cydeoStudent2);
        System.out.println(CydeoStudent.programmingLanguage);
        System.out.println(CydeoStudent.schoolName);
        cydeoStudent1.printProgramLanguage();
        cydeoStudent2.printProgramLanguage();
        cydeoStudent1.printSchoolName();
        cydeoStudent2.printSchoolName();
    }
}
