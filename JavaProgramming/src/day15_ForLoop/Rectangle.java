package day15_ForLoop;

public class Rectangle {
    public static void main(String[] args) {
        int w = 8;
        int l = 6;
     for (int a =1; a <= l ;a++){
         String str ="";
         for (int i =1;i <= w ;i++){
             str +="* ";
         }
         System.out.println(str);
     }
    }
}

