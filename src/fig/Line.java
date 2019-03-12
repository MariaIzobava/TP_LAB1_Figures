package fig;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:53 PM
 */
public class Line extends Ray {

	public Line(Point p1, Point p2, Color c) {
            super(p1, p2, c);
	}

	public void draw(Graphics2D g) {
              java.awt.Rectangle bounds = g.getClipBounds();
              Point inf2 = getInfinityPoint(firstPoint, secondPoint, bounds.width, bounds.height);
              Point inf1 = getInfinityPoint(secondPoint, firstPoint, bounds.width, bounds.height);
              g.setColor(borderColor);
              g.drawLine(inf1.x, inf1.y, inf2.x, inf2.y);
	}
}//end Line