package day19_LoopRecap;

public class FirstDublicatedCharactersolution2 {
    public static void main(String[] args) {
        String str= "ccbbnmmddds";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(str.indexOf(ch)==str.lastIndexOf(ch))){
                result +=ch;
                break;
            }
        }
        System.out.println(result);
    }
}


