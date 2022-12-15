package day17_While_DoWhile;

public class task1 {
    public static void main(String[] args) {
        String sentence="tamtamtamtamatam";
        String word = "tam";
        int frequency = 0;
        for (int i = 0; i < sentence.length()-2; i++) {
           String eachWord = sentence.substring(i,i+3);
           if(eachWord.equals("tam")){
               frequency++;
           }
        }
        System.out.println(frequency);
    }
}
