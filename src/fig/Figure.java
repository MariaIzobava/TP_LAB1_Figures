package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:49 PM
 */
public abstract class Figure {

	protected Color borderColor;
	protected Point center;
        
	public abstract void draw(Graphics2D g);

	public Color getborderColor() {
		return borderColor;
	}

	public Point location() {
		return center;
	}

	/**
	 * 
	 * @param p1
	 */
	public void move(Point p1) {

	}
	public abstract boolean isMouseOver(Point p1);
	/**
	 * 
	 * @param newVal
	 */
	public void setborderColor(Color newVal){
		borderColor = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCenter(Point newVal){
		center = newVal;
	}
        
}//end Figure