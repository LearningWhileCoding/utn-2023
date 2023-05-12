package test;

import domain.*;

/**
 *
 * @author augusto
 */
public class ObjectCastingTest {
    public static void main(String[] args) {
        
        Employee employee;
        employee = new Writer("Aristoteles", 100000000, TypeOfWriting.CLASSIC);
        System.out.println("employee = " + employee);
        System.out.println(employee.getDetails());
        
        // Downcasting
        //((Writer)employee).getTyperOfWriting();
        Writer writer = (Writer)employee;
        writer.getTyperOfWriting();
        
        // Upcasting
        Employee employee1 = writer;
        System.out.println(employee1.getDetails());
    }
}
