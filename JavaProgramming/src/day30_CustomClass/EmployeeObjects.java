package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        employee1.setInfo("Ayse",'F',3336,"Teacher",true,50000);
        Employee employee2= new Employee();
        employee2.setInfo("Ali",'M',3346,"Tester",true,45000);
        Employee employee3= new Employee();
        employee3.setInfo("Betul",'F',3338,"Architecture",false,35000);
        Employee employee4= new Employee();
        employee4.setInfo("Merve",'F',3336,"Doctor",true,60000);
        Employee employee5= new Employee();
        employee5.setInfo("Ayhan",'M',3337,"Teacher",false,70000);
        Employee[] employees= {employee1,employee2,employee3,employee4,employee5};
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.addAll(Arrays.asList(employees));
        System.out.println(employeeArrayList);
        int counter = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;
        for (Employee each : employees) {
            if (each.isFullTime == true) {
                counter++;
            }
            if (each.salary > max) {
                max = each.salary;
            }
            if (each.salary < min) {
                min = each.salary;
            }
        }
        System.out.println("Thee are"+counter+" full time employees");
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        }


    }
/*
Attributes:
        name,id,gender,jobTitle,isFullTime(boolean)
        Actions:
        toString();
        setInfo():
        work()...

        CapitalOne Class:
        1.Create 5 Employee objects
        2.store those into an array
        3.how many employees are full time employees?
        4.What's the min salary?
        5.What's the max salary?
        */