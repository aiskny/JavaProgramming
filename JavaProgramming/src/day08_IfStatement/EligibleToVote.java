package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 18;
        String citizen = "USA";

        //Two possible outcome;eligible or not

        boolean isEligible = age>=21 && citizen=="USA";
        if(isEligible){
            System.out.println("Josh is eligible to vote: " + isEligible);
        }
        if(!isEligible){
            System.out.println("not eligible");
        }
    }
}
