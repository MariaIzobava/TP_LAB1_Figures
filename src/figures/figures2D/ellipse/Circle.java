package figures.figures2D.ellipse;

import figures.figures2D.ellipse.Ellipse;

import java.awt.Color;
import java.awt.Point;

import static java.lang.Math.abs;

public class Circle extends Ellipse {

    public Circle(Point p1, Point p2, Color b, Color f) {
        super(p1, p2, b, f);
        setSecondPoint(p2);
    }

    @Override
    public void setSecondPoint(Point newVal) {
        Point p0 = new Point();
        int diam = java.lang.Math.max(abs(newVal.x - firstPoint.x), abs(newVal.y - firstPoint.y));
        p0.move((firstPoint.x < newVal.x) ? firstPoint.x + diam : firstPoint.x - diam,
                (firstPoint.y < newVal.y) ? firstPoint.y + diam : firstPoint.y - diam);
        secondPoint = p0;
    }
}