package day33_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {
        ArrayList<Integer>list1 =  new   ArrayList<>( );
       list1.addAll(Arrays.asList(1,2,3,4,5));
      list1.set(0,list1.get(4));

    }
}
