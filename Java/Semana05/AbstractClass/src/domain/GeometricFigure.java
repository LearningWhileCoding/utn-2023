package domain;

/**
 *
 * @author augusto
 */
public abstract class GeometricFigure {
    protected String figureType;
    
    protected GeometricFigure(String figureType) {
        this.figureType = figureType;
    }
    
    public abstract void draw();

    public String getFigureType() {
        return this.figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" + "figureType=" + figureType + '}';
    }
    
        
}
