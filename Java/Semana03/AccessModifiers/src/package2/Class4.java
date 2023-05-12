package package2;

/**
 *
 * @author augusto
 */
public class Class4 {
    private String privateField = "private field";
    
    private Class4() {
        System.out.println("private constructor");
    }
    
    public Class4(String arg) {
        this();
        System.out.println("public constructor");
    }
    
    private void privateMethod() {
        System.out.println("private method");
    }

    public String getPrivateField() {
        return this.privateField;
    }

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }
    
    
}
