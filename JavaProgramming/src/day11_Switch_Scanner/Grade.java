package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch ='C';
        String result = "";
        switch (ch){
            case'A':
            case'B':
            case'C':
            case'D':
                result = "Passed";
                break;
            case'F':
                result = "Failed";
                break;
            default:
                result = "Invalid";
        }
        System.out.println(result
        );
    }
}
