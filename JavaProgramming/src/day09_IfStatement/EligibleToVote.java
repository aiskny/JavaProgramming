package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Anna";
        int age = 17;

        boolean isEligibleToVote = age<18;

        if (!isEligibleToVote){
            System.out.println(name+ " is eligible to vote.");
        }else{
            System.out.println(name+ " is not  eligible to vote.");
        }
    }
}
