package day16_ForLoopStringPractise;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AbABBBBCC";
        char ch = 'A';
        int frequency = 0;
        for (int i =0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
           if(ch==eachChar){
               frequency ++;
           }
        }
        System.out.println(frequency);
    }
}
