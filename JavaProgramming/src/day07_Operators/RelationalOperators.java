package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        /*all relational operators return boolean
        greater than:>
        greater than or equal:>=
        less than:<
        less than or equal:<=
        equal:==
        not equal:!=

         */
        boolean result1=20>40;
        System.out.println("result1 = " + result1);

        boolean result2 =300>=150;
        System.out.println("result2 = " + result2);
        
        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3);

        boolean result4 = 300>=500;
        System.out.println("result4 = " + result4);
        
        //credit score of 720
        
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore>720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);
        
        boolean result5 = 100<120;
        System.out.println("result5 = " + result5);
        
        
        int score = 59;
        boolean hasFailed = score<=60;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("----------------------------------------------------------------------------------");
        
        int x= 100;
        int y =200;
        
        boolean equal =x==y;
        System.out.println("equal = " + equal);
        
        boolean result8 = "Muhtar"=="Good Guy";
        System.out.println("result8 = " + result8);
        
        boolean result9="A"=="a";
        System.out.println("result9 = " + result9);
        
        boolean result10="Java"=="Java";

        System.out.println("result10 = " + result10);
        
        boolean result11="Java"!="java";
        System.out.println("result11 = " + result11);
        
        boolean result12 = 100!=200;
        System.out.println("result12 = " + result12);
        
        boolean resul13= 5!=5.0;
        System.out.println("resul13 = " + resul13);
        

    }
}
