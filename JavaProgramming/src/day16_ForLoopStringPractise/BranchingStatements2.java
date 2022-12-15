package day16_ForLoopStringPractise;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if(i=='C')
                continue;
            System.out.print(i+"  ");
        }
        System.out.println();

        System.out.println("----------------------------------------------------------");
        for (int i = 0; i<11; i++) {
            if(i%2 != 0)
                continue;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------");

        for (int i = 1; i<11 ; i++) {

            if(i%2 == 0)
                continue;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (int j = 2; j<=2 ; j++) {
                System.out.print(j+" ");
            }
        for (int k = 3; k <9 ; k++) {
            if(( k%2==0  ))
                continue;
            System.out.print(k+" ");
        }

        for (int i = 10; i <100 ; i++) {
            if((i%2==0 || i%3==0 || i%5==0 || i%7==0 ))
                continue;
            System.out.print(i+" ");


        }

    }
}
