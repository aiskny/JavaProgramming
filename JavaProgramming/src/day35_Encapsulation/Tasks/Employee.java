package Encapsulation.Tasks;

public class Employee {
    private String name ;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {//This is constructor
       /* this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;*/
        setName(name);//will check the name is valid otherwise it not will set the name
        //what benefit those setter will give me?
        //1.constuctor it allows to set all of these instances as soon as the object created
        //then setter will check all the variables are valid or not?
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        if (name.isEmpty()){
            System.err.println("Invalid name!");
            System.exit(0);
        }
        this.name=name;
    }
    public void setAge(int age){
        if (age<16 || age>90){
            System.err.println("Invalid age: "+age);
            System.exit(0);
        }
        this.age = age;
    }
    public void setSalary(double salary){
        if (salary<=0){
            System.out.println("Invalid salary: "+salary);
        }
        this.salary = salary;
    }
    public void setGender(char gender){
        if (!(gender== 'M' || gender=='F')){
            System.err.println("Invalid gender!");
            System.exit(0);

            //return;
        }
        this.gender  = gender;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
