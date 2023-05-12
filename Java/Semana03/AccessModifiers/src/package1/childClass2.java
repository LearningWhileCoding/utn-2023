package package1;

/**
 *
 * @author augusto
 */
public class childClass2 extends Class2{
    public childClass2() {
        super();
        this.defaultField = "Change of the default field";
        System.out.println("defaultField = " + this.defaultField);
        this.defaultMethod();
    }
}
