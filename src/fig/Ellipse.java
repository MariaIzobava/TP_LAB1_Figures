package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import static java.lang.Math.abs;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:47 PM
 */
public class Ellipse extends Figure2D {

	protected Point firstPoint;
	protected Point secondPoint;

	public Ellipse(Point p1, Point p2, Color b, Color f) {
            super(b, f);
            firstPoint = p1;
            secondPoint = p2;
	}
        @Override
	public void draw(Graphics2D g) {
            if (g != null)
            {
                g.setColor(fillColor);
                Ellipse2D e = new Ellipse2D.Double((firstPoint.x < secondPoint.x) ? firstPoint.x : secondPoint.x, 
                        (firstPoint.y < secondPoint.y) ? firstPoint.y : secondPoint.y, abs(secondPoint.x - firstPoint.x), 
                        abs(secondPoint.y - firstPoint.y));
                g.fill(e);
                g.setColor(borderColor);
                g.draw(e);
                
            }
	}
        
        /**
	 * 
	 * @param newVal
	 */
	public void setFirstPoint(Point newVal){
	firstPoint = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSecondPoint(Point newVal) {
            secondPoint = newVal;
	}

	/**
	 * 
	 * @param p2
	 * @param p1
	 */
	public void setcenter(Point p2, Point p1){

	}

}//end Ellipse