package day24_CustomMethodReturnM;

public class ReturnStatement2 {
    public static void main(String[] args) {
        /*Create a method that can display the name of the month based on the given number to the method

         */
    }

    public static void nameOfTheMonth(int number, int year) {
        String result = "";
        if (number < 1 || number > 1) {
            System.out.println("Invalid");
            return;
        }
        if (number > 0 && number < 13) {
            switch (number) {
                case 2:
                    result = (year % 4 == 0) ? "29" : "28";
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

        }

        System.out.println(result);
    }
}

