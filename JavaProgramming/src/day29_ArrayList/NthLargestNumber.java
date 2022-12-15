package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 10, 40));
       /* int max = Collections.max(list);
        System.out.println(max);
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) == max){
                System.out.println(i);
            }
        }

        */
        int n = 3;
        for (int i = 1; i < n; i++) {
            list.removeIf(p -> p == Collections.max(list));
        }
        int max = Collections.max(list);
        System.out.println(max);
    }

}

