package day11_Switch_Scanner;

import java.security.cert.CertificateRevokedException;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 0.5;
        double n2 = 1.2;
        char operator = '*';
        boolean valid = operator == '-' || operator == '+' || operator == '*' || operator == '/';

            /* if(valid){
                 double result =(operator=='-')?(n1-n2):(operator=='+')?(n1+n2):(operator=='*')?(n1*n2):(n1/n2);
                 System.out.println(result);

             }else{
                     System.err.println("Invalid Operator: "+operator);
                 }*/
        if (valid) {
            switch (operator) {
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                default:
                case '/':
                    System.out.println(n1 / n2);
            }

        } else {
            System.err.println("Invalid Operator : " + operator);
        }


    }
}

