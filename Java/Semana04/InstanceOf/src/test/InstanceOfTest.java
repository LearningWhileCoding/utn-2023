package test;

import domain.*;

/**
 *
 * @author augusto
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        
        Manager manager1 = new Manager("Aron", 7000, "sales");
        getInstance(manager1);
        
        Employee employee1 = new Employee("Ross", 8000);
        //System.out.println("employee1 = " + employee1.getDetails());
        getInstance(employee1);
    }
    
    public static void getInstance(Employee employee) {
        
        if(employee instanceof Manager) {
            System.out.println("It's an instance of Manager Class.");
            Manager manager  = (Manager)employee;
            //((Manager) employee).getDepartment();
            System.out.println("Manager: " + manager.getDepartment());
        } 
        else if(employee instanceof Employee) {
            System.out.println("It's an instance of Employee Class.");
            //Manager manager = (Manager) employee;
            //System.out.println("Manager: " + manager.getDepartment());
        }
        else if(employee instanceof Object) {
            System.out.println("It's an instance of Object Class.");
        }
    }
}
