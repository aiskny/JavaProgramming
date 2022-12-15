package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] arg){


//age:40 years old


        byte age = 40;

        //weight:150 pounds

        //byte weight = 160;160 is out of byte' range
        //byte num=-129; -127 is out of the byte' range

        short weight = 160;  // 160 is within the range of the short
        //-32.769 and 32.768 are out of the short' range
        //salary: 50000; 50000 is out of the short' range

        //int is the most preferred date types

        int salary = 50_000;// for make readable use _

        long asset = 3_333_333_333L;//don't forget put L or l

        // tax:0.26
        float tax = 0.26F; // don't forget put f or F

       // double tax = 0.26; //double is the preferred one

        double PI=3.14;
        //
        char ch1='#';
        System.out.println("ch1 = " + ch1);

        char ch2=35;
        System.out.println("ch2 = " + ch2);

        char gender = 'F';
        System.out.println("gender = " + gender);
        char grade = 'F';
        System.out.println("grade = " + grade);
        String YesNo = "Y";
        System.out.println("yesNo = "+"Y");

        boolean isEmployeed = true;
        boolean isMarried = false;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);

        boolean result = 100>200;
        System.out.println("result = " + result);
                













    }
}
