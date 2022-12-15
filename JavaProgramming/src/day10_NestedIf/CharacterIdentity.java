package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '1';
        //char ch= 65;  result will be alphabetic, we can declare char as a number!

        if( ch>='0' && ch<='9') {
            System.out.println("Digit");
        } else if ((ch >='A' && ch<='Z') || (ch>='a' && ch<='z')) {
            System.out.println("Alphabetic");
        }else
            System.out.println("Special character");
    }
}
