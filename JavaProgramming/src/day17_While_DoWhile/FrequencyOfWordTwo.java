package day17_While_DoWhile;

public class FrequencyOfWordTwo {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog";

        int frequency = 0;
        for (int i = 0; i <str.length()-2 ; i++) {
            String eachWord = str.substring(i, i + 3);
            if (eachWord.equals("Cat")) {
                frequency++;
            }
        }
        System.out.println("frequencyCat = " + frequency);
    }
}
