package test;

import arithmetic.Arithmetic;
import exception.OperationException;

/**
 *
 * @author augusto
 */
public class ExceptionTesting {
    public static void main(String[] args) {
        
        int result = 0;
        
        try{
            result = Arithmetic.division(10, 0);
        }catch(OperationException e){
            System.out.println("An OperationException error has occured");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("An error has occured: ");
            e.printStackTrace(System.err); //Stack exception
            e.getMessage();
        }finally{
            System.out.println("The division has been checked.");
        }
        
        System.out.println("The value of result variable is = " + result);
        
    }
}
