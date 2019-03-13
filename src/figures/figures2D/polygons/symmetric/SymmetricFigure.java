package figures.figures2D.polygons.symmetric;

import figures.figures2D.polygons.Polygon;

import java.awt.Color;
import java.awt.Point;
import java.util.List;

public class SymmetricFigure extends Polygon {

    protected Point firstPoint;
    protected Point secondPoint;

    public SymmetricFigure(List<Point> pointsList, Color b, Color f) {
        super(pointsList, b, f);
    }

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