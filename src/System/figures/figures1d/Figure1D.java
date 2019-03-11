package System.figures.figures1d;

import System.figures.Figure;

import java.awt.*;

public abstract class Figure1D extends Figure {
    private Point firstPoint;
    private Point secondPoint;

    public Figure1D() {

    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
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
}//end Figure1D