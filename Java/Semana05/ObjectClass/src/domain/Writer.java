package domain;

/**
 *
 * @author augusto
 */
public class Writer extends Employee {
    
    final TypeOfWriting typeOfWriting;
    
    public Writer(String name, double salary, TypeOfWriting typeOfWriting) {
        super(name, salary);
        this.typeOfWriting = typeOfWriting;
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + ", Type of Writing: " + typeOfWriting.getDescription();
    }
    
    @Override
    public String toString() {
        return "Writer{" + "type of writing: " + typeOfWriting + '}' + " " + super.toString();
    }
    
    public TypeOfWriting getTyperOfWriting() {
        return this.typeOfWriting;
    }
    
    
}
