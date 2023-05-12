package domain;

/**
 *
 * @author augusto
 */
public enum TypeOfWriting {
    CLASSIC ("Handwriting"),
    MODERN ("Digital writing");
    
    private final String description;
    
    private TypeOfWriting(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
    
    
}
