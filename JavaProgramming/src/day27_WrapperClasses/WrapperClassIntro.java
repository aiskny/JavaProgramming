package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1 = 200;
        Integer n1 = num1;//Autoboxing
        int num2 = n1;//unboxing
        System.out.println("--------------------------------------------------");
        Integer integerValue = 100;
        long longValue = integerValue;

        System.out.println("---------------------------------------------");
        Byte b1 = 25;//Autoboxing
        byte a1 = b1;//unboxing
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;
        System.out.println("---------------------------------------------------");
        int num3 = 200;
        Integer n3 = num3;
        // I can not convert another wrapper class
       //Long n4 = num3;//it gives compiler error!

        System.out.println("------------------------------------------");
        Integer z = 900;
        Integer y = z;
        //these are not autoboxing or unboxing,none of them!

    }
}
