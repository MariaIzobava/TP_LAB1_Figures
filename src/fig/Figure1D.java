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
            setCenter();
    }
    
    
    @Override
    public boolean isMouseOver(Point p1) {
        return (center.distance(p1) < Math.min(8, center.distance(secondPoint)));
    }
    
    @Override
    public void move(Point p1) {
        firstPoint.x += p1.x;
        firstPoint.y += p1.y;
        secondPoint.x += p1.x;
        secondPoint.y += p1.y;
        setCenter();
    }

    public void setCenter() {
        center.move((firstPoint.x + secondPoint.x)/2, 
                (firstPoint.y + secondPoint.y)/2);
    }
        
        
}//end Figure1D