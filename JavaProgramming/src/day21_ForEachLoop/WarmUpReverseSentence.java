package day21_ForEachLoop;

public class WarmUpReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good to learn Java";
        String[] words = sentence.split(" ");
        for (int i = words.length-1; i >=0; i--) {
            System.out.print(words[i]+" ");
        }
    }
}
