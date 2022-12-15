package day19_LoopRecap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        /*
        output: a2b1c3d1
         */
        String result ="";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    counter++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result +=ch;
            result +=counter;
        }
        System.out.println(result);
    }
}