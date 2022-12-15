package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {
    public static void main(String[] args) {
        //write a program that can move all zeros to the last indexes of an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);
        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        int newSize = list.size();
        int totalNumberOfZeros = size-newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i < totalNumberOfZeros; i++) {
           list.add(0);
        }
        System.out.println(list);

    }
}
