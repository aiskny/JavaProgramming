package day07_Operators;

public class UnaryOperators {
   public static void main(String[] args){
     /*1-unary Plus Operator=+=indicates positive value
     2-Unary minus Operator=-negates an expression or value
     3-Increment Operator=++increments a value  by 1
     4-Decrement Operator--decrement a value by 1*/
      
      int a=-100;
      int b=+200;
      boolean aIsNegative=a<0;
      boolean bIsPositive=b>0;

      System.out.println("aIsNegative = " + aIsNegative);
      System.out.println("bIsPositive = " + bIsPositive);
     
     int x=10;
      System.out.println(++x);//11-Pre increment
      System.out.println(--x);//10-pre decrement

      int z=20;
      System.out.println(z++);//20-Post Increment
       System.out.println(z);//to implemeting post increment we need two line.

       int k=12;
       System.out.println(k--);
       System.out.println(k);

       int t =45;
       System.out.println(++t);
       System.out.println(t++);
       System.out.println(t);
        int q = 30;
       System.out.println(--q);
       System.out.println(q--);
       System.out.println(q);


     
     
      
   }
}
