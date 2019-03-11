package System.figures.figures2d.polygons.symmetric;

import System.figures.figures2d.polygons.Polygon;

import java.awt.*;

public class SymmetricFigure extends Polygon {
    protected Point firstPoint;
    protected Point secondPoint;

    public SymmetricFigure() {

    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    /**
     * @param p1
     */
    public void move(Point p1) {

    }

    /**
     * @param newVal
     */
    public void setFirstPoint(Point newVal) {
        firstPoint = newVal;
    }

    /**
     * @param newVal
     */
    public void setSecondPoint(Point newVal) {
        secondPoint = newVal;
    }
}//end SymmetricFigure