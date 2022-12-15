package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        System.out.println();//we can not reach the private data even if the class is same
        //private is not visible outside of the class
        AccessModifiers.method1();
        AccessModifiers.method2();
       // AccessModifiers.method3(); private is not visible outside the class
    }
}
