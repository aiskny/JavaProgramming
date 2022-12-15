package day11_Switch_Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number = 75;
        String result = "";
        Boolean validNumber = number == 25 || number == 50 || number == 75;
        if(validNumber) {    if (number == 50) {
            result = "20 Crew,30 Passengers";
        } else if (number == 75) {
            result = "25 Crew, 50 Passengers";
        } else {
            result = "30 Crew, 70 Passengers";
        }

    }else{
            result = "invalid Number";
        }
        System.out.println(result);
    }
}
