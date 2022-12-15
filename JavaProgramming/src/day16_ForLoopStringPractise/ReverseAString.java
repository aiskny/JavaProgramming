package day16_ForLoopStringPractise;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "ayse";
        String result = "";

        for (int i =str.length()-1 ; i>=0; i--) {
            result += str.charAt(i);
        }
        System.out.print(result);









    }
}

