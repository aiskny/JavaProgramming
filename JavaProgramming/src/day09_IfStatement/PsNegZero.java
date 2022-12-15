package day09_IfStatement;

public class PsNegZero {
    public static void main(String[] args) {
//Multi Branch if;
        int n = 100;
        if(n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");

        }else{
            System.out.println("Zero");
        }
    }
}
