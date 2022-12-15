package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {
    static {
        System.out.println("Static block");//static block will bw printed first on the console
    }
    public Constructor_vs_StaticBlock(){//the constructor will not be executed,
        // because execution of the constructor is only depends on object,there is no object so far
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        //it will get executed from top to bottom
        System.out.println("Main Method");

        new Constructor_vs_StaticBlock();//this is the object ,it will print "Constructor"
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }

}
