package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        /*
        ArrayList Methods:
	add(Data): adds the data after the last index of the ArrayList

	add(index, Data): inserts the data at the given index

	size(): returns the total number of elements

	get(index): returns the element at the given index

	set(index,  Data): replaces the element at given index with the new element.

	remove(int index): removes the element at the given index

	remove(Object): removes the given object from arraylist, returns boolean

	clear(): remove all the elements of the arraylist, size will be 0

	indexOf(Data): returns the first matching element's index number, returns int

	lastIndexOf(Data): returns the last matching element's index number, returns int

	contains(Data): returns true if the element is contained in the arraylist, otherwise returns false

	equals(ArrayList): returns true if two arraylists are equal (same elements in same order), otherwise returns false
         */

        //1.add(Data): adds the data after the last index of the ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Serpil");
        list.add("Ayse");
        System.out.println(list);
        //2.add(index, Data): inserts the data at the given index
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0, 20);
        numbers.add(1, 12);
        numbers.add(2, 5);
        System.out.println(numbers);
        //size(): returns the total number of elements
        ArrayList<Character> chars = new ArrayList<>();
        chars.add(0, 'A');
        chars.add(1, 'B');
        chars.add(2, 'A');
        chars.add(3, 'B');
        System.out.println(chars);
        int x = chars.size();
        System.out.println(x);
        System.out.println(chars.size());
        //  4.get(index): returns the element at the given index
        String[] array = {"Serpil", "Zeynep", "Furkan", "Suleyman"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(array));
        System.out.println(names);
        String first = names.get(0);
        System.out.println(names.get(0));
        System.out.println(first);
        String last = names.get(names.size() - 1);
        System.out.println(last);
        System.out.println(names);
//5.set(index,  Data): replaces the element at given index with the new element.
        Double[] darr = {0.5, 1.5, 2.5};
        ArrayList<Double> nums1 = new ArrayList<>(Arrays.asList(darr));
        nums1.set(0, 3.5);
        System.out.println(nums1);

        Integer[] arr = {1, 2, 3};
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(arr));
        nums2.set(nums2.size() - 1, 5);
        System.out.println(nums2);
//6.remove(int index): removes the element at the given index
     /*   nums2.remove(0);
        System.out.println(nums2);
        boolean r1 = nums2.remove("5");
        System.out.println(r1);
        System.out.println(nums2);*/

//Calling remove(object)
//numbers.remove(new Integer(3));
        Integer[] arr3 = {1, 2, 3, 4, 5};
        ArrayList<Integer> num3 = new ArrayList<>(Arrays.asList(arr3));
        System.out.println(num3);
        boolean r3 = num3.remove(new Integer(5));
        System.out.println(r3);
        //7.clear(): remove all the elements of the arraylist, size will be 0

        /*//num4.clear();
        System.out.println(num4);
//8.indexOf(Data): returns the first matching element's index number, returns int
       int y = num4.indexOf(10);
        System.out.println(y);
        System.out.println(num4.indexOf(10));*/
        //9.lastIndexOf(Data): returns the last matching element's index number, returns int
        Integer[] arr4 = {10,10, 20, 30, 40, 50,50};
        ArrayList<Integer> num4 = new ArrayList<>(Arrays.asList(arr4));
        num4.lastIndexOf(50);
        System.out.println(num4.lastIndexOf(50));
        //10.contains(Data): returns true if the element is contained in the arraylist, otherwise returns false
        num4.contains(30);
        System.out.println(num4.contains(30));
        //11.equals(ArrayList): returns true if two arraylists are equal (same elements in same order), otherwise returns false
        ArrayList<Integer> nums6 = new ArrayList<>();
        nums6.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(nums6);
        ArrayList<Integer> num7 = new ArrayList<>();
        num7.addAll(Arrays.asList(1,2,3,4,5));
       boolean r6 = nums6.equals(num7);
        System.out.println(r6);

    }
}
