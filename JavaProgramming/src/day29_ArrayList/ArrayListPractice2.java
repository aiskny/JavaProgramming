package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
       //remove every single name which stars with "M"
        String[] names = {"Murat","Melike","Nese","Banu"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(name -> name.startsWith("M"));
        //list.removeIf(p -> p.charAt(0) == 'M');
        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Veli","Kaan","Nuri","Ali"));
        employees.retainAll(Arrays.asList("Ali"));
        System.out.println(employees);

    }
}
