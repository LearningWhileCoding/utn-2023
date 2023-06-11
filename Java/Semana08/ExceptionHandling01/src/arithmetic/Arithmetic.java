package arithmetic;

import exception.OperationException;

/**
 *
 * @author augusto
 */
public class Arithmetic {
    
    public static int division(int numerator, int denominator) throws OperationException{
        
        if(denominator == 0) {
            
            throw new OperationException("Division by zero!");
        }
        return numerator/denominator;
    }
}
