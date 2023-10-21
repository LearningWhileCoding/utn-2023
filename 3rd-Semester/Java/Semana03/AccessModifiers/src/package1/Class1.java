package package1;

/**
 *
 * @author augusto
 */
public class Class1 {
    public String publicField = "public field value";
    protected String protectedField = "protected field value";
    
    public Class1() {
        System.out.println("public constructor");
    }
    
    public void publicMethod() {
        System.out.println("public method");
    }
    
    protected Class1(String protectedField) {
        System.out.println("constructor protected");
    }
    
    protected void protectedMethod() {
        System.out.println("protected method");
    }
}
