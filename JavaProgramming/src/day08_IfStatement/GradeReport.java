package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;

        boolean a= score>=90 && score<=100;
       // boolean b=score>=80 && score<=89;
        boolean b= score>=80 && !a;
        //boolean c =score>=70 && score<=79;
        boolean c = score>=70 && !b && !a;
        //boolean d = score>=60 && score<=69;
        boolean d = score>=60 && !a && !b && !c;
        //boolean e = score>=0 && score<=59;
        boolean e = score>=0 && !a && !b && !c && !d;

        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(e){
            System.out.println("Failed");
        }

        System.out.println("---------------------------------------------------------------------------");

        int number = 3;
        boolean january = number==1;
        boolean february = number==2;
        boolean march = number==3;
        boolean april = number==4;
        boolean may = number==5;
        boolean june = number==6;
        boolean july = number==7;
        boolean august = number==8;
        boolean september = number==9;
        boolean october =number==10;
        boolean november= number==11;
        boolean december = number==12;


        if(january){
            System.out.println("January");
        }
        if(february){
            System.out.println("February");
        }
        if(march){
            System.out.println("March ");
        }
        if(april){
            System.out.println("April");
        }
        if(may){
            System.out.println("may");
        }
        if(june){
            System.out.println("june");
        }
        if(july){
            System.out.println("July");
        }
        if(august){
            System.out.println("August");
        }
        if(september){
            System.out.println("September");
        }
        if(october){
            System.out.println("October");
        }
        if(november){
            System.out.println("November");
        }
        if(december){
            System.out.println("December");
        }
    }
}
/*
90-100==Excellent
80-89==Great
70-79==Good
60-69==Passed
0-59==Failed


 */