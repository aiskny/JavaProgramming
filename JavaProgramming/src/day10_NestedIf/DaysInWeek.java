package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
/*
        int n = 5;
        String day ="";

        if(n>=1 && n<8){
            if(n==1){
                day="Monday";
            } else if (n==2) {
                day="Tuesday";

            } else if (n==3) {
                day="Wednesday";

            }else if(n==4){
                day="Thursday";
            } else if (n==5) {
                day="Friday";

            } else if (n==6) {
                day= "saturday";

            }else {
                day = "Sunday";*/

                System.out.println("------------------------------------------------------------------");
                 int n = 5;

       String result= (n==1)? "Monday": (n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday":(n==5)?"Friday":(n==6)?"Saturday":"Sunday";

        System.out.println(result);
    }
}
