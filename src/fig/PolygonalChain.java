package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.List;

/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:56 PM
 */
public class PolygonalChain {

	private List<Segment> segments;
        private Color borderColor;
        
	public PolygonalChain(List<Point> points, Color c) {
            borderColor = c;
            for (int i=0; i< points.size()-1; ++i)
                segments.add(new Segment(points.get(i), points.get(+1), borderColor));

	}
	public void draw(Graphics2D g) {
            for (Segment s : segments)
                s.draw(g);

	}

	public List<Segment> getsegments(){
		return segments;
	}

	/**
	 * 
	 * @param p2
	 * @param p1
	 */
	public void move(Point p2, Point p1){

	}

	public void setcenter(){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsegments(List<Segment> newVal){
		segments = newVal;
	}
}//end PolygonalChain