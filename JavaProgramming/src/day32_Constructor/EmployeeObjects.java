package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali");
        Employee employee2 = new Employee("Ayse",'F');
        Employee employee3= new Employee("Betul",'F',"Java Developer");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
