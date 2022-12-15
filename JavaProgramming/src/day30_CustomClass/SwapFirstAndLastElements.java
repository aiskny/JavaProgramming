package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapFirstAndLastElements {
    public static void main(String[] args) {
        //write a program that can swap first element and last element of an Arraylist


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);
    }
}
