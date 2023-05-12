package package1;

/**
 *
 * @author augusto
 */

class Class2 {
    String defaultField = "default field value";
    
    Class2() {
        System.out.println("default constructor");
    }
    /*
    public Class2() {
        super();
        this.defaultField = "change of the default field";
        System.out.println("defaultField = " + this.defaultField);
        this.defaultMethod();
    }*/
    
    void defaultMethod() {
        System.out.println("default method");
    }
}
