package figures.figures1D;

import figures.Figure;
import figures.figures1D.segments.Segment;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class PolygonalChain extends Figure {

    private ArrayList<Segment> segments;

    public PolygonalChain(List<Point> points, Color c) {
        borderColor = c;
        System.out.println(points.size());
        segments = new ArrayList<>();
        center = points.get(0);
        for (int i = 0; i < points.size() - 1; ++i) {
            segments.add(new Segment(points.get(i), points.get(i + 1), borderColor));
        }

    }

    public void draw(Graphics2D g) {
        for (Segment s : segments)
            s.draw(g);

    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void move(Point p2, Point p1) {

    }

    @Override
    public boolean isMouseOver(Point p1) {
        return false;
    }

    public void setCenter() {

    }

    public void setSegments(ArrayList<Segment> newVal) {
        segments = newVal;
    }
}