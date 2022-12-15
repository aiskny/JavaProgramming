package day33_Static.Tasks;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int StudentID;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo School";
    public static String programmingLanguage= "Java";

    public CydeoStudent(String name, int age, char gender, int studentID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        StudentID = studentID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studying");
    }
    public void attendClass(){
        System.out.println(name+ " is attending class ");
    }
    public void printSchoolName(){
        System.out.println("School Name: "+ schoolName);
    }
    public void printProgramLanguage(){
        System.out.println("Program Language: "+programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", StudentID=" + StudentID +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:
Attributes:
instances: name, age,
gender, id, grade, batchNumber, groupNumber
statics: schoolName,
programmingLanguage
Add a constructor that can set All the
fields (instances)
Actions:
study()
attendClass()
printSchoolName(): displays
the school name
printProgLanguage():
displays the name of programming language
toString()
 */
