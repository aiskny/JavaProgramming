package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    //we need to make this class as a subclass to access the protected variables in the protected access modifier class
    public static void main(String[] args) {
        //System.out.println(AccessModifiers_Test4.name1);
        //bydefault variables is not accessable
        System.out.println(AccessModifiers_Test4.name2);
        //protected is visible outside package in subclass only

        // ProtectedAccessModifier.method1();
        //by default access modifier is not visible for subclass
        ProtectedAccessModifier.method2();
        //protected is visible outside the package to the subclass
    }
}
