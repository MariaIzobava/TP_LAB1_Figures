package fig;

import java.awt.Color;
import java.awt.Point;
import java.util.List;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:56:03 PM
 */
public class SymmetricFigure extends Polygon {

	protected Point firstPoint;
	protected Point secondPoint;

    public SymmetricFigure(List<Point> pointsList, Color b, Color f) {
        super(pointsList, b, f);
    }

    public Point getFirstPoint(){
            return firstPoint;
    }

    public Point getSecondPoint(){
            return secondPoint;
    }

    /**
     * 
     * @param p1
     */
    public void move(Point p1){

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
}//end SymmetricFigure