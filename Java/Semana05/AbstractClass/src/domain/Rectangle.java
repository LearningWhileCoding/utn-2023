package domain;

/**
 *
 * @author augusto
 */
public class Rectangle extends GeometricFigure {

    public Rectangle(String figureType) {
        super(figureType);
    }

    @Override
    public void draw() {
        System.out.println("Class: " + this.getClass().getSimpleName());
    }
}
