package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
                /*
                Warmup tasks:
	1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
                 */

        for (Integer each : numbers) {
            int frequency = 0;
            for (Integer element : numbers) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);
                break;
            }
        }
    }
}
