package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        int z=x+y;

        System.out.println("z ="+z);

        x=3;
        y=5;
        z=x+y;

        System.out.println("z ="+z);

       /* x= (int) 0.5;
        y=0.3;*/
        
        double a=0.5;
        double b=0.3;
        double c=a*b;
        System.out.println("c = " + c);
        
        a=2;
        b=3;
        c=a*b;
        System.out.println("c = " + c);
        
        String name = "Ayse";
        System.out.println("name = " + name);
        
        name="Ali";
        System.out.println("name = " + name);

        name="Betul"+3;
        System.out.println("name = " + name);


        System.out.println("--------------------------------------------------------------");

        //Additional Assignment
        int m= 100;
        System.out.println(m);
        m+= 200;
        System.out.println("m = " + m);

        String str="Wooden";
        str+=" Spoon";

        System.out.println(str);

        double num1=2.5;
        num1+=3.5;
        System.out.println(num1);

        double availableBalance=1000.50;
        //deposit 300$;
        availableBalance+=300;
        System.out.println("availableBalance ="+availableBalance);


        System.out.println("--------------------------------------------------------------------------");
        //withdrawing $500

        availableBalance -=500;
        System.out.println("availableBalance = "+availableBalance);

        //withdrawing $200'then depositing $400

        availableBalance-=200;
        availableBalance+=400;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------------------------------------------------------------");
        
        double salary = 50000;
        salary*=2;
        System.out.println("salary = " + salary);
        
        double doge = 0.00000001;
        doge*=1000000;
        System.out.println("doge = " + doge);

        System.out.println("---------------------------------------------------------------------");
        
        double num2=25000;
        num2/=2;
        System.out.println("num2 = " + num2);

        System.out.println("---------------------------------------------------------------------");
 
        double num3=100;
        num3%=3;

        System.out.println("num3 = " + num3);
        System.out.println("---------------------------------------------------------------------");

        int n = 300;
        n%=16;

        System.out.println("n = " + n);

        System.out.println("---------------------------------------------------------------------");

        int balance=3500;
        //insurance fee:$153;
        balance %=153;
        System.out.println("balance = " + balance);
        






    }
}
