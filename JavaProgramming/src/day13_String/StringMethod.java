package day13_String;

public class StringMethod {
    public static void main(String[] args) {
        String password = "AyseKonya";
        int totalChars=password.length();
        System.out.println("totalChars = "+totalChars);
        char lastChar=password.charAt(password.length()-1);
        System.out.println("last character is:"+lastChar);
    }
}
