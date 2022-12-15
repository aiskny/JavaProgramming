package day24_CustomMethodReturnM;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Ayse Konya");
        initial("Ali", "Konya");
        domainOfAnEmail("konyaayse@gmail.com");
        System.out.println("-------------------------------------------------------");
        String[] emails = {"alikonya@gmail.com", "all@yahoo.com", "sss@hotmail.com"};
        for (String email : emails) {
            domainOfAnEmail(email);
        }
        nameOfTheMonth(12);
        nameOfTheDay(7);
        theNumberOfDaysAMonth(6,2022);
    }

    public static void initials(String name) {
        String[] names = name.split(" ");
        for (String each : names) {
            String initials = each.charAt(0) + ".";
            System.out.print(initials);
        }
    }

    public static void initial(String firstName, String lastName) {
        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initials);
    }

    public static void domainOfAnEmail(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
        System.out.println(domain);
    }

    public static void nameOfTheMonth(int number) {
        String name = "";
        if (number >= 1 && number < 13) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March"
                    : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June"
                    : (number == 7) ? "Julay" : (number == 8) ? "August" : (number == 9) ? "Sep"
                    : (number == 10) ? "oct" : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "invalid";
        }
        System.out.println("Month name = " + name);
    }

    public static void nameOfTheDay(int number) {
        String name = "";
        if (number >= 1 && number <= 7) {
            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday"
                    : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            name = "Invalid";
        }
        System.out.println("Name of the day = " + name);
    }

    public static void theNumberOfDaysAMonth(int number, int year) {

        String result = "";

        if (number > 0 && number < 13) {
            switch (number) {
                case 2:
                    result=(year%4==0)?"29":"28";
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result = "31 days";
                    break;
                default:
                    result = "30 days";
                    break;

            }

        } else {
            result = "Invalid";
        }

        System.out.println(result);
    }
}