package day24_CustomMethodReturnM;

public class ReturnMethodPractice {
    public static void main(String[] args) {
       int maxNumber = max(10,11);
        System.out.println(maxNumber);
        int multiplication = maxNumber*2;
        System.out.println(multiplication);
    }
    public static int max(int number1,int number2){
        int result = 0;
        if (number1>number2){
            result += number1;
        }else{
            result +=number2;
        }
        return result;
    }

}
