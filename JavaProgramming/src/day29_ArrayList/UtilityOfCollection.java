package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UtilityOfCollection {
    public static void main(String[] args) {
        /*
        Collections: utility class of collection
	sort()
	reverse()
	swap()
	max()
	min()
	replaceAll()
	frequency()
         */
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Veli","Ahmed","Mahmud","Mustafa","Ali"));
        //1.sort()
        Collections.sort(names);
        System.out.println(names);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(9,8,7,6,5,4,3,2,1));
        Collections.sort(numbers);
        System.out.println(numbers);
        //2.reverse()
        Collections.reverse(numbers);
        System.out.println(numbers);
        //3.swap()
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);
        //4.max()
       //int max = Collections.max(numbers);
        //System.out.println("max = " + max);
       int max = Collections.max(numbers);
        System.out.println(max);
        System.out.println("max = " + max);
        //5.min()
       int min =  Collections.min(numbers);
        System.out.println("min = " + min);
        //replaceAll()
        Collections.replaceAll(numbers,min,max);
        System.out.println(numbers);
        //frequency()
        int frequency = Collections.frequency(numbers,8);
        System.out.println("frequency = " + frequency);
    }
}
