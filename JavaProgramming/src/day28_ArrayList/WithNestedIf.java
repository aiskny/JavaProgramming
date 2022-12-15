package day28_ArrayList;

public class WithNestedIf {
    public static void main(String[] args) {
        String password = "CyLdeo1990@";
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;
        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigit = countDigits>0;
        boolean hasSpecialChar = countSpecialChar>0;

        boolean strongPassword = false;
        if (password.length()>=8){
            if (!password.contains(" ")){
                if (hasLowerCase){
                    if (hasUpperCase){
                        if (hasDigit){
                            if (hasSpecialChar){
                                strongPassword=true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(strongPassword);
    }
}
