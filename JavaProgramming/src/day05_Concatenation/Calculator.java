package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber=100;
        int secondNumber=50;
        //100+50=150
        //100-50=50
        //100*50=5000
       /* System.out.println(firstNumber+" + "+secondNumber+" = "+(firstNumber+secondNumber));
        System.out.println(firstNumber+" - "+secondNumber+" - "+(firstNumber-secondNumber));
        System.out.println(firstNumber+" * "+secondNumber+" = "+(firstNumber*secondNumber));
        */

        int addition=firstNumber+secondNumber;
        System.out.println(firstNumber+" + "+secondNumber+" = "+addition);
        int subtraction=firstNumber-secondNumber;
        System.out.println(firstNumber+" - "+secondNumber+" = " + subtraction);
        int multiplication=firstNumber*secondNumber;
        System.out.println(firstNumber+" * "+secondNumber+" = " + multiplication);
    }
}
