package fig;

import java.awt.Color;
import java.awt.Point;
import java.util.List;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:58 PM
 */
public class Rectangle extends SymmetricFigure {

    public Rectangle(List<Point> pointsList, Point p, Color b, Color f) {
        super(pointsList, b, f);
        firstPoint = secondPoint = p;
        for (int i=0; i<4; ++i)
            points.add(new Point(p.x, p.y));
    }
    
    @Override
    public void setSecondPoint (Point p)
    {
        points.get(2).x = p.x;
        points.get(2).y = p.y;
        points.get(1).x = points.get(0).x;
        points.get(1).y = points.get(2).y;
        points.get(3).x = points.get(2).x;
        points.get(3).y = points.get(0).y;
    }
    
    

}//end Rectangle