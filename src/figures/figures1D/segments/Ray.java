package figures.figures1D.segments;

import figures.figures1D.segments.Segment;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public class Ray extends Segment {

    public Ray(Point p1, Point p2, Color c) {
        super(p1, p2, c);
    }

    public void draw(Graphics2D g) {
        if (g != null) {
            Rectangle bounds = g.getClipBounds();
            Point inf = getInfinityPoint(firstPoint, secondPoint, bounds.width, bounds.height);
            g.setColor(borderColor);
            g.drawLine(firstPoint.x, firstPoint.y, inf.x, inf.y);
        }
    }

    protected Point getInfinityPoint(Point p1, Point p2, int width, int height) {
        Point inf = new Point();
        if (p1.x != p2.x) {
            if (p1.x < p2.x)
                inf.move(width,
                        p1.y + (p2.y - p1.y) * (width - p1.x) / (p2.x - p1.x));
            else
                inf.move(0,
                        p1.y + (p2.y - p1.y) * p1.x / (p1.x - p2.x));
            if (inf.y < 0 || inf.y > height) {
                if (p1.y < p2.y)
                    inf.move(p1.x + (p2.x - p1.x) * (height - p1.y) /
                            (p2.y - p1.y), height);
                else
                    inf.move(p1.x + (p2.x - p1.x) * p1.y /
                            (p1.y - p2.y), 0);

            }

        } else
            inf.move(p1.x, (p1.y < p2.y) ? height : 0);

        return inf;
    }
}