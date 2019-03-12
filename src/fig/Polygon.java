package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:55 PM
 */
public class Polygon extends Figure2D {

	protected List<Point> points;

	public Polygon (List<Point> pointsList, Color b, Color f) {
            super(b, f);
            points = pointsList;
	}


	public List<Point> getpoints(){
		return points;
	}

	/**
	 * 
	 * @param p1
	 */
	public void move(Point p1){

	}
        
        @Override
        public void draw(Graphics2D g) {
            if (g != null && points.size()!=0)
            {
                g.setColor(fillColor);
//                for (int i=0; i < points.size()-1; ++i)
//                    g.drawLine(points.get(i).x, points.get(i).y, points.get(i+1).x, points.get(i+1).y);
//                g.drawLine(points.get(points.size()-1).x, points.get(points.size()-1).y, points.get(0).x, points.get(0).y);
                int[] xCords = new int[points.size()];
                int[] yCords = new int[points.size()];
                for (int i=0; i<points.size(); ++i)
                {
                    xCords[i]=points.get(i).x;
                    yCords[i]=points.get(i).y;
                }
                g.fillPolygon(xCords, yCords, points.size());
                g.setColor(borderColor);
                g.drawPolygon(xCords, yCords, points.size());
            }
        }

	public void setcenter(){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setpoints(List<Point> newVal){
		points = newVal;
	}

    
}//end Polygon