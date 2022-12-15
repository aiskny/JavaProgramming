package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(nums);//if indirectly print the array variable, it is going to give me hashcode,reason;
//We need to do explicitly
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);//an int number;it can be directly pass in String method
        System.out.println("-----------------------------------------------------------------------");
        int[] scores = {40,54,20,89,100};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score: "+scores[0]);
        System.out.println("Max score: "+scores[scores.length-1]);
        String[] names = {"Anna","Gunay","Ahmed","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        String[] words ={"Anna","ANNA"};
        System.out.println(Arrays.toString(words));
        System.out.println("---------------------------------------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        Arrays.equals(arr1,arr2);
        boolean r1 =Arrays.equals(arr1,arr2);
        System.out.println( Arrays.equals(arr1,arr2));
        System.out.println(r1);
        Arrays.sort(arr1);//my array is gonna order according ascending order
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);
        System.out.println("---------------------------------------------------------------");
        //"acb", "bac"
        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b', 'a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println("anagram = " + anagram);
    }
}
