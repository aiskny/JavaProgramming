package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 100;
       if(num1<num2){
            System.out.println(num1+" is the minimum number");

        }
       if (num1==num2) {
            System.out.println("Equal");

        }
       if (num2<num1) {
           System.out.println(num2+"is the minimum number");

       }

        /*boolean result = num1 <num2;
        //boolean result2=!result;
        if(result){
            System.out.println(num1+" is the minimum number");
        }else if(!result){
            System.out.println("Equal");
        }

        /*Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number



         */

    }
}
