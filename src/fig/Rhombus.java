package fig;

import java.awt.Color;
import java.awt.Point;
import java.util.List;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:56:00 PM
 */
public class Rhombus extends IsoscelesTriangle {

    public Rhombus(List<Point> pointsList, Point p1, Color b, Color f) {
        super(pointsList, p1, b, f);
        points.add(new Point(p1.x, p1.y));
    }
    
    @Override
    public void setSecondPoint(Point p2)
    {
        super.setSecondPoint(p2);
        points.get(3).x = points.get(1).x;
        points.get(3).y = secondPoint.y;
    }
    
    
}//end Rhombus