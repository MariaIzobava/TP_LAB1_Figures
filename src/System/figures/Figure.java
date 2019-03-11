package System.figures;

import java.awt.*;

public abstract class Figure {
    protected Color borderColor;
    protected Point center;

    public Figure() {

    }

    public abstract void draw();

    public Color getBorderColor() {
        return borderColor;
    }

    public Point location() {
        return null;
    }

    /**
     * @param p1
     */
    public void move(Point p1) {

    }

    /**
     * @param newVal
     */
    public void setBorderColor(Color newVal) {
        borderColor = newVal;
    }

    /**
     * @param newVal
     */
    public void setCenter(Point newVal) {
        center = newVal;
    }
}//end Figure