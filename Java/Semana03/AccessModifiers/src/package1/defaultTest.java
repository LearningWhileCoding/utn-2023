package package1;

import package2.Class4;

/**
 *
 * @author augusto
 */
public class defaultTest {
    public static void main(String[] args) {
        //Class2 class2 = new Class2();
        
        childClass2 childClass2 = new childClass2();
        childClass2.defaultField = "Change from the test";
        System.out.println("default field childClass2  = " + childClass2.defaultField);
        
        Class4 class4 = new Class4("public arg");
        class4.setPrivateField("setting private field");
        System.out.println("class4 = " + class4.getPrivateField());
    }
}
