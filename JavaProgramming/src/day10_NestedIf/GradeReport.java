package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score=65;




        if(score<=100 && score>=0){
            if(score>=90){
                System.out.println("Excellent");
            } else if (score>=80) {
                System.out.println("Great");
            } else if (score>=70) {
                System.out.println("Good");

            } else if (score>=60) {
                System.out.println("Passed");

            } else if (score<60) {
                System.out.println("Failed");

            }
        }else{
            System.out.println("Invalid");
        }
    }
}
