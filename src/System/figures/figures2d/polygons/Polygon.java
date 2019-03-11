package System.figures.figures2d.polygons;


import System.figures.figures2d.Figure2D;

import java.awt.*;
import java.util.ArrayList;

public class Polygon extends Figure2D {
    protected ArrayList<Point> points;

    public Polygon() {

    }

    public void draw() {

    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    /**
     * @param p1
     */
    public void move(Point p1) {

    }

    public void setCenter() {

    }

    /**
     * @param newVal
     */
    public void setPoints(ArrayList<Point> newVal) {
        points = newVal;
    }
}//end Polygon