package day22_MultiDiemontialArrays;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        String[] group1 = {"Ayse","Ali,Ahmet"};
        String[] group2 = {"Betul","Merve","Ahsen"};
        String[] group3 = {"Betul","Merve","Ahsen"};


        String[][] groups = new String[3][];//index:0,1,2
        groups[0] =group1;
        groups[1] = group2;
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));
        System.out.println("---------------------------------------------------");
       /* {1,2,3,}
        {4,5,6,7}
        {8,9,10,11,12}
        */
        //                0 1 2    0 1 2 3   0 1  2  3  4
        int[][] arr2D = {{1,2,3,},{4,5,6,7},{8,9,10,11,12}};
//              index =     0         1            2

        System.out.println(arr2D[2][3]);
    }
}
