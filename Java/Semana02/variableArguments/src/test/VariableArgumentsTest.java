package test;

/**
 *
 * @author augusto
 */
public class VariableArgumentsTest {
    public static void main(String[] args) {
        
        printNumbers(0,2,4,6,8);
        printNumbers(1,3,5,7);
        multipleParameters("Rocky", "Balboa", 1,2,3);
    }
    
    private static void printNumbers(int ...numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Elements: " + numbers[i]);
        }
    }
    
    private static void multipleParameters(String name, String lastname, int...numbers) {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        printNumbers(numbers);
    }
}