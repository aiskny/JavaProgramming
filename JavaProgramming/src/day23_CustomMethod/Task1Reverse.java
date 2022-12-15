package day23_CustomMethod;

public class Task1Reverse {
    public static void main(String[] args) {
        String str ="Java";
        String reverse = "";
        for (int i = str.length()-1; i>=0  ; i--) {
            char ch = str.charAt(i);
            reverse +=ch;
        }
        System.out.println(reverse);

    }
}
