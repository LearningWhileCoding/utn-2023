package domain;

/**
 *
 * @author augusto
 */
public class Person {
    private final int personId;
    private static int personCounter; 
    
    // Static init block (Only for static fields). Executed only one time.
    static{ 
        System.out.println("Execution of the static block");
        ++personCounter;
    }
    
    // Non static init block (Dynamic context).
    {
        System.out.println("Execution of the non static block");
        this.personId = Person.personCounter++;
    }
    
    public Person() {
        System.out.println("This is the constructor!");
    }

    public int getPersonId() {
        return this.personId;
    }

    @Override
    public String toString() {
        return "Person{" + "personId=" + personId + '}';
    }
    
    
}
