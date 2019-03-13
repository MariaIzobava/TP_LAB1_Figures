package figures.figures1D;

import figures.Figure;

import java.awt.Point;

public abstract class Figure1D extends Figure {

    protected Point firstPoint;
    protected Point secondPoint;

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setFirstPoint(Point newVal) {
        firstPoint = newVal;
    }

    public void setSecondPoint(Point newVal) {
        secondPoint = newVal;
    }
}