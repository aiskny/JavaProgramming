package day27_WrapperClasses;

public class


WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";

         int num = Integer.parseInt(str);//it is not a autoboxing or unboxing because Integer.parseInt(str); return int value!

        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 = "10.5";
       double num2 =  Double.parseDouble(str2);
        System.out.println(num2+1);

       int max =  Integer.MAX_VALUE;
       int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);
        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println(max2);
        System.out.println(min2);

        String s1 = "true";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);

        String s2 = "false";
        boolean b2 = Boolean.parseBoolean(s2);
        System.out.println(b2);

        String s3 = "maybe";
        boolean b3 = Boolean.parseBoolean(s3);
        System.out.println(b3);
        System.out.println("---------------------------------------");

        String s = "123";
       Integer x = Integer.valueOf(s);
       int y = Integer.valueOf(s);
        System.out.println(x);
        System.out.println(y);

        String s4 = "1.5";
        Double z = Double.valueOf(s4);
        System.out.println(z);

        System.out.println("------------------------------------------------");

        //isDigit
        char ch1 = '0';// character 0 is digit
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);

        char ch2 = 'A';//character A is not digit
        boolean r3 = Character.isDigit(ch2);
        System.out.println(r3);

        char ch3= 'B';//character B is letter
        boolean r4 = Character.isLetter(ch3);
        System.out.println(r4);

        char ch5 = '!';//special char
        boolean r5 = Character.isLetterOrDigit(ch5);
        System.out.println(r5);

        char ch6 = 'E';//uppercase char
        boolean r6 = Character.isUpperCase(ch6);
        System.out.println(r6);

        char ch7 = 'E';//lowercase char
        boolean r7 = Character.isLowerCase(ch7);
        System.out.println(r7);

        System.out.println("------------------------------------------");
        String c = "ab1cde2efg3hhi4";
        int sum = 0;
        for (char each : c.toCharArray()) {
            if (Character.isDigit(each)){
                sum +=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
