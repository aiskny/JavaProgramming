package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words = {"Java Programming","Cydeo School","Wooden Spoon","Early Birds","Angry Birds"};

        for (String word : words) {
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);

            System.out.println(first+""+last);
        }
    }
}
