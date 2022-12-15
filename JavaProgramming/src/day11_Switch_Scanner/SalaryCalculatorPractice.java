package day11_Switch_Scanner;

public class SalaryCalculatorPractice {
    public static void main(String[] args) {
        double salary = 100_000;
        double taxRate = 0;

        boolean isMarried = true;
        if (salary >= 130_000) {
            taxRate = 0.35;
        } else if (salary >= 100_000) {
            taxRate = 0.30;
        } else if (salary >= 80_000) {
            taxRate = 0.25;
        } else
            taxRate = 0.2;
        if(isMarried){
            taxRate-=0.05;
        }
        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println(salaryAfterTax);
    }
        }

