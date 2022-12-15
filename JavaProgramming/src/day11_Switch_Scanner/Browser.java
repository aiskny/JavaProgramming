package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

       // String browser = "Vivaldi";
        String browser = "Chrome";
        String name = "";

        boolean validBrowser = browser=="Chrome" || browser=="FireFox" || browser == "Opera" || browser == "Safari"
                || browser == "Edge" || browser == "ie";
        if(validBrowser) {
            if (browser == "Chrome") {
                name = "Chrome";
            } else if (browser == "FireFox") {
                name = "FireFox";

            } else if (browser == "Opera") {
                name = "Opera";

            } else if (browser == "Safari") {

                name = "Safari";

            } else if (browser == "Edge") {

                name = "Edge";

            } else if (browser == "ie") {

                name = "ie";

            } else

                name = "Invalid";
            System.out.println(name + " Browser is selected");
        }

    }
}
