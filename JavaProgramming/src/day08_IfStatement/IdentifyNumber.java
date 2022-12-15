package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = 200;
        boolean isPositiveNumber = number>0;
        boolean isNegativeNumber = number<0;
        boolean isZero = number==0;

        System.out.println(number+" is Positive Number : " + isPositiveNumber);
        System.out.println(number+"is Negative Number : " + isNegativeNumber);
        System.out.println(number+" is Zero : " + isZero);



    }
}
