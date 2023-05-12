package package2;

import package1.Class1;

/**
 *
 * @author augusto
 */
public class Class3 extends Class1 {
    public Class3() {
        super("protected");
        this.protectedField = "Accessing from the child class";
        System.out.println("protectedField = " + this.protectedField);
        this.publicField = "Totally public";
    }
}
