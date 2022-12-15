package day16_ForLoopStringPractise;

public class Mix {
    public static void main(String[] args) {
        String str = "Ayse 12456Konya!@#$%";
        String digits = "";
        String letters = "";
        String specialChar = "";
        for (int i =0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if(ch>='0' && ch <= '9'){
                digits +=ch;
            }else if(ch >= 'A' && ch <='Z'){
                letters += ch;
            }else if(ch >= 'a' && ch <='z'){
                letters += ch;
            }else{
                specialChar += ch;
            }

        }
        System.out.println(digits+letters + specialChar);;
    }
}
