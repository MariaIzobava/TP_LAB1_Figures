package fig;

import java.awt.Color;
import java.awt.Point;
import java.util.List;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:52 PM
 */
public class IsoscelesTriangle extends SymmetricFigure {

    public IsoscelesTriangle(List<Point> pointsList, Point p1, Color b, Color f) {
        super(pointsList, b, f);
        setFirstPoint(p1);
        for (int i=0; i<3; ++i)
            points.add(new Point(p1.x, p1.y));
    }
    
    
    
    @Override
    public void setSecondPoint (Point p2)
    {
        super.setSecondPoint(p2);
        points.get(0).x = firstPoint.x;
        points.get(0).y = firstPoint.y + (secondPoint.y - firstPoint.y)/2;
        points.get(1).x = firstPoint.x + (secondPoint.x - firstPoint.x)/2;
        points.get(1).y = firstPoint.y;
        points.get(2).x = secondPoint.x;
        points.get(2).y = points.get(0).y;
    }
}//end IsoscelesTriangle