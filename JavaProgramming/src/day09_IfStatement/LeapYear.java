package day09_IfStatement;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;

        boolean isYaerLeap = year%4==0;

        if (isYaerLeap){

            System.out.println( year+" is a  leap year.");

        } else {

            System.out.println( year+" is not a leap year.");

        }


    }
}
