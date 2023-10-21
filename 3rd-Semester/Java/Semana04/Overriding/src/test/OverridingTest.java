package test;

import domain.*;

/**
 *
 * @author augusto
 */
public class OverridingTest {
    public static void main(String[] args) {
        
        Manager manager1 = new Manager("Aron", 7000, "sales");
        //System.out.println("manager1 = " + manager1.getDetails());
        print(manager1);
        
        Employee employee1 = new Employee("Ross", 8000);
        //System.out.println("employee1 = " + employee1.getDetails());
        print(employee1);
    }
    
    public static void print(Employee employee) {
        System.out.println("employee = " + employee.getDetails());
    }
}
