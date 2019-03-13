package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:56 PM
 */
public class PolygonalChain extends Figure {

	private ArrayList<Segment> segments;

	public PolygonalChain(List<Point> points, Color c) {
            borderColor = c;
            System.out.println(points.size());
            segments = new ArrayList<>();
	    center = points.get(0);
            segments.add(new Segment(points.get(0), new Point(points.get(1)), borderColor));
            for (int i=1; i< points.size()-2; ++i) {
		segments.add(new Segment(new Point(points.get(i)), new Point(points.get(i+1)), borderColor));
            }
            segments.add(new Segment(new Point(points.get(points.size()-2)), points.get(points.size()-1), borderColor));

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
	public void move(Point p1) {
            for (Segment s : segments)
                s.move(p1);
	}
        
        
	@Override
	public boolean isMouseOver(Point p1){
		for (Segment s : segments)
                    if (s.isMouseOver(p1))
                        return true;
                return false;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsegments(ArrayList<Segment> newVal){
		segments = newVal;
	}
}//end PolygonalChain