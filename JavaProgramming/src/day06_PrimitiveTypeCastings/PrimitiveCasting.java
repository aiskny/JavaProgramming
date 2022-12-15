package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
       /* byte a=100;
        short b=a;

        double d1=20.5;
        short s1= (short) d1;
*/

        int a=10;
        //double c=a;
        short d= (short) a;
        System.out.println(a + ":"+d);


        double d1=20.5;
        short s1=(short)d1;
        System.out.println(d1 +":"+ s1);

        float f=2.5f;
        long h= (long) f;
        System.out.println(f+":"+h);
    }
}
