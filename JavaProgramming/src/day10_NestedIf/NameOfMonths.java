package day10_NestedIf;

public class NameOfMonths {
    public static void main(String[] args) {

        int n = 11;

        String nameofmonth = (n == 1) ? "Jenuary" : (n == 2) ? "February" : (n == 3) ? "March" : (n == 4) ? "April" : (n == 5) ? "May" : (n == 6) ? "June" : (n == 7) ? "July" : (n == 8) ? "August" : (n == 9) ? "September" : (n == 10) ? "October" : (n == 11) ? "November" : "December";

        System.out.println(nameofmonth);
    }
}
