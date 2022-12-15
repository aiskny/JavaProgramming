package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] group1 ={"Ali","Ayse","Ahsen"};
        String[] group2={"Betul","Merve"};
        String[] students = new String[group1.length+group2.length];
        int i = 0;
        for (String each : group1) {
            students[i++] = each;
        }
        for (String each : group2) {
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));
        System.out.println("-----------------------------------------------------------------");
        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'D','E'};
        char[] sum = new char[ch1.length+ch2.length];
        int k=0;
        for (char each : ch1) {
            sum[k++]=each;
        }
        for (char each : ch2) {
            sum[k++]=each;
        }
        System.out.println(Arrays.toString(sum));
    }
}
