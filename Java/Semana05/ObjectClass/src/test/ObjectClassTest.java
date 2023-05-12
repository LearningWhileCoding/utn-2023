package test;

import domain.*;

/**
 *
 * @author augusto
 */
public class ObjectClassTest {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Margaret", 2000);
        Employee employee2 = new Employee("Margaret", 2000);
        
        if(employee1 == employee2) {
            System.out.println("It's the same memory reference.");
        } 
        else {
            System.out.println("It's not the same memory reference.");
        }
        
        if(employee1.equals(employee2)) {
            System.out.println("The values of the object are equals.");
        }
        else {
            System.out.println("The value of the object are not equals.");
        }
        
        if(employee1.hashCode() == employee2.hashCode()) {
            System.out.println("The hashCode values are equals.");
        }
        else {
            System.out.println("The hashCode values are not equals.");
        }
    }
}
