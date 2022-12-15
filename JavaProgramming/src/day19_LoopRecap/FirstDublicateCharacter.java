package day19_LoopRecap;

public class FirstDublicateCharacter {
    public static void main(String[] args) {
        String str = "abcccdd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(""+ch);
                break;
            }
        }
    }
}
