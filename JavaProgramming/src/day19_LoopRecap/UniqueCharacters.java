package day19_LoopRecap;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = " faabccddeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    counter++;
                }
            }
            if (counter == 1) {
                result += ch;
            }
        }
        System.out.println(result);
    }
}