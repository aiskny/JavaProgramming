package day09_IfStatement;

public class PassOrFail {
    public static void main(String[] args) {

        int  score = 75;

        boolean isPassed = score>=60;

        if(isPassed){

            System.out.println("Congrats, you passed");
        }else{
            System.out.println("failed");
        }

    }
}
