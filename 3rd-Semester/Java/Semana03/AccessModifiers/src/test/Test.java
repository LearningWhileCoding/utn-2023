package test;

import package1.Class1;
import package2.Class3;

/**
 *
 * @author augusto
 */
public class Test {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println("class1 = " + class1.publicField);
        class1.publicMethod();
        
        Class3 class3 = new Class3();
        System.out.println("class3 = " + class3);
        
    }
}
