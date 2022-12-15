package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name ="Steven";
        int age = 19;
        String citizen = "UK";

       // boolean isEligible = age>=18 && citizen=="USA";

       // System.out.println(name+" is eligible to vote: "+isEligible);

        name="Aaron";
        age=18;
        citizen = "USA";
        boolean isEligible = age>=18 && citizen=="USA";

        System.out.println(name+" is eligible to vote: "+isEligible);
        
        boolean result1=true;
        System.out.println("result1 = " + result1);
        boolean result2=!result1;
        System.out.println("result2 = " + result2);

        int score =85;
        boolean passed=score>=60;
        boolean failed=!passed;
        System.out.println("pass = " + passed);
        System.out.println("failed = " + failed);


        


    }
}
