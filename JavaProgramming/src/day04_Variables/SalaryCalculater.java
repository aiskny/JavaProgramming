package day04_Variables;

public class SalaryCalculater {

    public static void main(String[] args) {

        //hourlyRate, weeklyHours
        //not; variable names should be camel case

       /* int hourlyRate = 50;
        int weeklyHours = 40;
        int salary = hourlyRate * weeklyHours * 52;
        System.out.println(salary);

// soutv; variable



        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("salary = " + salary);
        */

        int hourlyRate = 60;
        int weeklyHours= 50;
        int salary = hourlyRate * weeklyHours * 52;
        System.out.println(salary);
        System.out.println("salary = $" + salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        
    }
}
