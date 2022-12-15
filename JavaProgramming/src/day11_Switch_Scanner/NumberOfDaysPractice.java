package day11_Switch_Scanner;

public class NumberOfDaysPractice {
    public static void main(String[] args) {
        int number = 2;
        int year = 2022;
        String result = "";
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    if (year % 4 == 0) {
                        result = "29 Days";
                    } else {
                        result = "28 Days";
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 Days";
                default:
                    result = "31 Days";
            }

        } else {
            result = "Invalid";

        }
        System.out.println(result);
    }
}
