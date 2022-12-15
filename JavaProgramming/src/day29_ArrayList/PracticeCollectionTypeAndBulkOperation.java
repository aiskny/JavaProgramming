package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeCollectionTypeAndBulkOperation {
    public static void main(String[] args) {
        /*
        ulk Operations: argumnet MUST be a collection type

	addAll(CollectionType): adds collection of values to the arrayList
	removeAll(CollectionType): removes all the matching elements from the arraylist
	retainAll(CollectionType): removes all the non-matching elements from the arraylist
	containsAll(CollectionType): checks if all the elements are contained in the arraylist
         */
        //1.addAll(CollectionType): adds collection of values to the arrayList
        Integer[] arr1 = {9,8,7,6,5,4,3,2,1};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        list1.addAll(Arrays.asList(10,11,12,13,14,15));
        System.out.println(list1);
        //2.removeAll(CollectionType): removes all the matching elements from the arraylist
        list1.removeAll(Arrays.asList(9,8,7,6,5));
        System.out.println(list1);
        //3.retainAll(CollectionType): removes all the non-matching elements from the arraylist
        list1.retainAll(Arrays.asList(1,10,11,15));
        System.out.println(list1);
        //4.containsAll(CollectionType): checks if all the elements are contained in the arraylist
        boolean r = list1.containsAll(Arrays.asList(10,11,16));
        System.out.println(r);
        arr1 = list1.toArray(new Integer[1]);
        System.out.println(Arrays.toString(arr1));


    }
}
