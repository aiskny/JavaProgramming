package day07_Operators;

public class LogicalOperators {
    public static void main(String[] args) {/*
    &&:Logical AND
    ||:Logical OR
    !:Logical NOT

  AND(&&)
  False-False:False
  False-True:False
  True-False:False
  True-True:True
 OR(||)
 False-False:False
 False-True:True
 True-False:True
 True-True:True


 NOT(!)(Opposite)
 False=True
 True=False

    */
//And(&&)
        boolean result1 = 12>11 && 12>5;
        System.out.println(result1);
        boolean result2 = 12>11 && 12>13;
        System.out.println(result2);
        boolean result3 = 12>15 && 12>-10;
        System.out.println(result3);
        boolean result4 = 12>100 && 12<-9;
        System.out.println(result4);
 //OR(||)
        boolean result5 = -1<-2 || -6>-7;
        System.out.println(result5);
        boolean result6 = -1>-2 || 0.5<-3;
        System.out.println(result6);
        boolean result7 = -2<-3 || -9<=-10;
        System.out.println(result7);
        boolean result8 = 10==10 || 10!=9;
        System.out.println(result8);

 //NOT(!)
        boolean result9 = !false;
        System.out.println(result9);
        boolean result10 = !true;
        System.out.println(result10);

    }

}
