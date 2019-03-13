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
	@Override
	public void move(Point p1) {
		firstPoint.x+=p1.x;
		firstPoint.y+=p1.y;

		secondPoint.x+=p1.x;
		secondPoint.y+=p1.y;
	}
    public boolean isMouseOver(Point p1) {
        java.awt.Rectangle r = new java.awt.Rectangle(firstPoint.x-10, firstPoint.y-10,secondPoint.x+10,secondPoint.y+10);
        return r.contains(p1.x,p1.y);
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