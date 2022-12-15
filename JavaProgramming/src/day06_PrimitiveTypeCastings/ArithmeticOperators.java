package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(100-20);
        System.out.println(100+20);
        System.out.println(100*20);

        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println(100/3.0);
        System.out.println(10.0/3.0);
        System.out.println(10d/4);



        //integer/integer=integer
        //integer/decimal=decimal
        //decimal/integer=decimal
        //decimal/decimal=decimal

       /* int a =100;
        double b = a/6;

        System.out.println(b);
*/
      /*  int a=100;
        double b=a/6.0;
        System.out.println(b);*/

        int a=100;
        double b= a/6;

        System.out.println(a/6d);

        double c=(double)a/b;
        System.out.println(c);
        
        int division=(int)(a/b);
        System.out.println("division = " + division);




    }
}
