package test;

import domain.Person;

/**
 *
 * @author augusto
 */
public class ForEachTest {
    public static void main(String[] args) {
        int ages[] = {27,28,29,30};
        for (int age: ages) {
            System.out.println("Age: " + age);
        }
        
        Person people[] = {new Person("Ragnar"), new Person("Rolo"), new Person("John")};
        
        for(Person person : people) {
            System.out.println("person = " + person);
        }
    }
}
