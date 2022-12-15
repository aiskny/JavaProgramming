package day16_ForLoopStringPractise;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Ayse12345Konya!@#$%AliKonya";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);

            str.indexOf(str.charAt(i));
            if (str.charAt(str.indexOf(i)) >= 48 && str.charAt(str.indexOf(i)) <= 57) {
                digits += "" + ch;
            }
            if ((str.charAt(str.indexOf(i)) >= 65 && str.charAt(str.indexOf(i)) <= 90) || (str.charAt(str.indexOf(i)) >= 97 && str.charAt(str.indexOf(i)) <= 122)) {
                    letters += "" + ch;
                } else
                    specialChars += "" + ch;

        }
    }
}