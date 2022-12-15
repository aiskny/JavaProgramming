package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);
        //default is not visible outside the package
        //System.out.println(AccessModifiers.privateData);
        //private is not visible outside the class
        AccessModifiers.method1();
        //we can not reach private and default methods
        //because default modifier is not visible outside the package
        //private modifier is not visible already outside the class
    }
}
