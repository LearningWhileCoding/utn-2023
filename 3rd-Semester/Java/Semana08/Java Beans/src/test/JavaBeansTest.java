package test;

import domain.Person;

/**
 *
 * @author augusto
 */
public class JavaBeansTest {
    
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setName("Harry");
        person.setLastname("Potter");   
        System.out.println("person = " + person);
        
        System.out.println("Name person: " + person.getName());
        System.out.println("Lastname person: " + person.getLastname());
    }
}
