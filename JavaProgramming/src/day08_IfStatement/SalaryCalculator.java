package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*declare the following variables;
        hourlyRate, weeklyHours,stateTax,federalTax
        
         */
        int hourlyRate = 50,
                weeklyHours =45;
        
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;
        
        int salaryBeforeTax = hourlyRate*weeklyHours*52;
        double stateTax=salaryBeforeTax*stateTaxRate/100;
        double federalTax=salaryBeforeTax*federalTaxRate/100;
        double totalTax= stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is :$ " + salaryBeforeTax);
        System.out.println("State tax is:$ " + stateTax);
        System.out.println("federalTax : $ " + federalTax);
        System.out.println("totalTax :% " + totalTax);
        System.out.println("N" +
                "et income :$ " + salaryAfterTax);
    }
}
