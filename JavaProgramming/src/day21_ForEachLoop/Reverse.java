package day21_ForEachLoop;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String[] names = {"Ayse Konya", "Ali Konya", "Betul Konya", "Merve Konya", "Ahsen Konya"};
        for (String each : names) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
