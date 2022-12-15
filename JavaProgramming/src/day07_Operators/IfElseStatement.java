package day07_Operators;

public class IfElseStatement {
    public static void main(String[] args) {
        int score = 75;
        if(score>=60){
        System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


        int score2 = 101;
        if(score2>=85){
            System.out.println("A");
        }else if(score2>100){
            System.out.println(5*10);
        }else {
            System.out.println(5*5);
        }
/*
int x=10;

        int number=x++ + 100; //number
        System.out.println("number = " + number);

        int number2=++x +100;
        System.out.println("number2 = " + number2);
 */



        int ucretYillik = 100_000;
        double tax = 0;


        if (ucretYillik<=12_500){
            tax = ucretYillik*0;
            System.out.println("tax is "+tax);
        }else if(ucretYillik>12_500 & ucretYillik<=50_000){
            tax=(ucretYillik-12500)/5;
            System.out.println("tax2 is "+tax);

        } else if (ucretYillik<=100000 & ucretYillik>50000) {
            tax=((ucretYillik-50000)*2)/5+(50000-12500)/5;
            System.out.println("tax3 = " + tax);
        } else if (ucretYillik>100000) {
            tax=(ucretYillik-100000)*0.55+(50000*0.4)+(50000-12500)*0.2;
            System.out.println("tax4 = " + tax);

        }


    }
}

