package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZero2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (each!=0){
                result.add(each);
            }
        }
        for (Integer each : list) {
            if (each==0) {
               result.add(0);
            }
        }
        System.out.println(result);
    }
}
