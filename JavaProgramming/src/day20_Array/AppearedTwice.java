package day20_Array;

public class AppearedTwice {
    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};
        char ch = chars[0];
           String twice = "";
        for (char i = 0; i < chars.length; i++) {
            int frequency = 0;
            ch = chars[i];
            for (int j = 0; j < chars.length; j++) {
                if (ch == chars[j]) {
                    frequency++;
                }
            }
            if (frequency == 2 && !twice.contains(""+ch)){
                twice +=ch;
                twice +=frequency;
            }

        }
        System.out.println(twice);
    }
}
