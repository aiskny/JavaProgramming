package Encapsulation.Tasks;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ayse",'F',40,45000);
        employee1.setName("15");//if i wanna change the data , i can not access directly to the data
        System.out.println(employee1);
        //System.out.println(employee1);it will gives the hash code ,it means you need to use to string method in employee class

        Employee employee2 = new Employee("",'A',10,10000);
        System.out.println(employee2);
        //if i wanna change the data , i can not access directly to the data
       // employee1.name = 40;


    }
}
