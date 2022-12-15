package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeMyself {
    public static void main(String[] args) {
        String[] arr ={"Turkey","Canada","Azerbeycan","Kirgizistan"};
       ArrayList<String>list = new ArrayList<>(Arrays.asList(arr));
       list.removeIf(p-> p.length()>6);
       arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        String[] names = {"Ayse","Betul","Ali","Ahsen","Merve","Another"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(names));
        list1.removeIf(name->name.length()>5);
       names = list1.toArray(new String[1]);
        System.out.println(Arrays.toString(names));

        String[] colors = {"blue","Yellow","Red"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(colors));
        list2.removeIf(color->color.length()<4);
        colors = list2.toArray(new String[2]);
        System.out.println(Arrays.toString(colors));

    }
}
