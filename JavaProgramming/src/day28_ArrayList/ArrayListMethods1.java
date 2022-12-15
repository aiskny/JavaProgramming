package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(2,15);
        System.out.println(numbers);

        System.out.println(numbers.size());
        int lastIndex = numbers.size() -1 ;
        System.out.println("last index = " + lastIndex);
       Integer firstElement =  numbers.get(0);
        System.out.println(firstElement);
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("----------------------------------------------------");
        ArrayList<String>list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript");
        list.set(3,"C++");

        System.out.println(list);
        System.out.println("------------------------------------------------");
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("kuat");
        employees.add("Fuat");
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("kuat");
        System.out.println(employees);
        boolean r1 = employees.remove("Aygun");//remove method returns boolean at the same time, so we can assign a boolean
        System.out.println(r1);



    }
}
