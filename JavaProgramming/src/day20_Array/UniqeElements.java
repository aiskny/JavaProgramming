package day20_Array;

public class UniqeElements {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python"};

String result ="";
        for (int j = 0; j < words.length; j++) {
            String element = words[j];
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) {
                    frequency++;
                }
            }
            if (!result.contains(element)) {
                result += element;
                result += frequency;
            }
        }
        System.out.println(result);
    }
}
