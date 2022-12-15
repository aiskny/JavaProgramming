package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] myGroup = new String[5];
        myGroup[0] = "Ayse";
        myGroup[1] = "Ali";
        myGroup[2] = "Betul";
        myGroup[3] = "Merve";
        myGroup[4] = "Ahsen";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("-----------------------------------------------------------------------");

      //method 1-
        String[] dayOfWeek = new String[7];
        dayOfWeek[0] = "Monday";
        dayOfWeek[1] ="Tuesday" ;
        dayOfWeek[2] = "Wednesday";
        dayOfWeek[3] = "Thursday";
        dayOfWeek[4] = "Friday";
        dayOfWeek[5] = "Saturday";
        dayOfWeek[6] = "Sunday";
//Method-2
        System.out.println(Arrays.toString(dayOfWeek));
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));

    }
}