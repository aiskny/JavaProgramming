package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeefggggggggggggggghiiiiiiiiiiijkkkkkkkkkkkkkkkkkkkl";//how can i create an arraylist?,i can not create directly?
        // i use split method, so I can reach each character of string,split method returns String[]!
        // then i use in the instructure of Arrays.asList
       String[] arr =  str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency==1){
                unique +=each;
            }
        }
        System.out.println("unique = " + unique);
    }
}
