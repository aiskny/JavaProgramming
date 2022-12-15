package day08_IfStatement;

public class NumberOfDayMonths {
    public static void main(String[] args) {
        int number = 11;
        String numberOfDays = "";

        boolean a= number==2;
        boolean b=number==4 || number==6 || number==9 || number==11;
        boolean c= !a && !b && number<12 && number>0;
        if(a){
            numberOfDays="28";
        } else if (b) {
            numberOfDays="30";

        } else if (c) {
            numberOfDays="31";

        }
        System.out.println(numberOfDays);
    }
}
