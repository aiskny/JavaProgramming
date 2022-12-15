package day19_LoopRecap;

public class ExitMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i==4){
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("aaa");
    }
}
