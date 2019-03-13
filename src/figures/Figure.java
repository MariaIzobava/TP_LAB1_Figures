package figures;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class Figure {

    protected Color borderColor;
    protected Point center;

    public abstract void draw(Graphics2D g);

    public Color getBorderColor() {
        return borderColor;
    }

    public Point location() {
        return center;
    }

    public void move(Point p1) {

    }

    public abstract boolean isMouseOver(Point p1);

    public void setBorderColor(Color newVal) {
        borderColor = newVal;
    }

    public void setCenter(Point newVal) {
        center = newVal;
    }

}