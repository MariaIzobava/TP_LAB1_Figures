package fig;

import java.awt.Point;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:50 PM
 */
public abstract class Figure1D extends Figure {

	protected Point firstPoint;
	protected Point secondPoint;
        
	public Point getFirstPoint(){
		return firstPoint;
	}

	public Point getSecondPoint(){
		return secondPoint;
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
	public void setSecondPoint(Point newVal){
		secondPoint = newVal;
	}
}//end Figure1D