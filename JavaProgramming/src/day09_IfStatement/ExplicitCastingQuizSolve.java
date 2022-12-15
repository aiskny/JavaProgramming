package day09_IfStatement;

public class ExplicitCastingQuizSolve {
    public static void main(String[] args) {
       /* int ivar = 100;
        double dvar = 123;
        float fvar = 200;
/*
        ivar=fvar;// at this line I try to convert a float number to an int number format , this is possible only via explicit casting;

        ivar= (int)fvar;//no error!

        fvar = ivar;// at this line I try to convert an int number to a float number,it has already  done because this is implicit casting.

        dvar = fvar;// at this line I try to convert a float number a double number,this is implicit casting as well.

        fvar = dvar;// at this line I try to convert a double number to a float number format , this is possible only via explicit casting;

        fvar = (float)dvar;// no error!

        dvar = ivar;//at this line I try to convert an int number to a double number,it has already  done because this is implicit casting.

        ivar = dvar;// at this line I try to convert a double number to an int number,this is possible only via explicit casting;

        ivar=(int)dvar;//no error!*/


       /* float a =100.987_6543f;


        short b= (byte)a;//At this line a will convert to byte format,it is a kind of rounding;
        //100.987_6543 will be 100  a byte number(value os byte: -128 between 127)


        byte c = (byte)b;//b was 100 and same byte  format that's why c will be 100.*/

       // ???????????????????????

        long a= 3_000L;

        double b = (float)a;//a was long format at first line, at this line a will be float format so float include long;
        // a will be 3000.0 so b as well

        int c = (short)b;//at this line b will transform short format so not decimal format b=3000, int c=3000 as well.

        //3000%1000 the result will be 0








    }
}
