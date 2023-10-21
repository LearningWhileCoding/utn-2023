package test;

/**
 *
 * @author augusto
 */
public class Test {
    public static void main(String[] args) {
        // Autoboxing
        int primitiveInteger = 1;
        System.out.println("primitiveInteger = " + primitiveInteger);
        Integer wrapperInteger = 2;
        System.out.println("wrapperInteger = " + wrapperInteger.floatValue());
        
        // Unboxing
        int primitiveInteger2 = wrapperInteger;
        System.out.println("primitiveInteger2 = " + primitiveInteger2);
    }
}
