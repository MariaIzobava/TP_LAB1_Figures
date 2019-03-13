package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:56:01 PM
 */
public class Segment extends Figure1D {

    public Segment(Point p1, Point p2, Color c) 
    {
        firstPoint = p1;
        secondPoint = p2;
        center = new Point((firstPoint.x + secondPoint.x)/2, 
                    (firstPoint.y + secondPoint.y)/2);
        borderColor = c;
    }

    @Override
    public void draw(Graphics2D g) {

        if (g != null)
        {
            g.setColor(borderColor);
            g.drawLine(firstPoint.x, firstPoint.y, secondPoint.x, secondPoint.y);
            g.setColor(Color.RED);
            g.drawOval(firstPoint.x - 2, firstPoint.y - 2, 4, 4);
            g.drawOval(secondPoint.x - 2, secondPoint.y - 2, 4, 4);
        }

    }

    /**
     * 
     * @param p1
     */
    
    
    

    
        
}//end Segment