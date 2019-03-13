package fig;

import java.awt.Color;
import java.awt.Point;
import java.util.List;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:59 PM
 */
public class RegularPolygon extends Polygon {
    
    protected int pointNum;

    public RegularPolygon(List<Point> pointsList, Point cent, int n, Color b, Color f) {
        super(pointsList, b, f);
        pointNum = n;
        center = cent;
        
    }

    public int getpointNum(){
            return pointNum;
    }
    
    @Override
    public void setpoints(List<Point> curPolyList)
    {
       double radius = center.distance(curPolyList.get(0));
       double angle = 2*Math.PI / ((double)(pointNum));
       double offset = Math.atan (((double)(curPolyList.get(0).y - center.y))/
               ((double)(curPolyList.get(0).x - center.x)));
       if (curPolyList.get(0).x == center.x)
        {
           offset = Math.PI/2;
            if (curPolyList.get(0).y > center.y)
                offset = - Math.PI/2;
        }
       for (int i=1; i< pointNum; ++i)
       {
           if (curPolyList.get(0).x > center.x)
                curPolyList.add(new Point(center.x + ((int)(radius*Math.cos(i*angle+offset))), 
                   center.y + ((int)(radius * Math.sin(i*angle+offset)))));
           else
                curPolyList.add(new Point(center.x - ((int)(radius*Math.cos(i*angle+offset))), 
                   center.y - ((int)(radius * Math.sin(i*angle+offset)))));
       }
    }

    /**
     * 
     * @param newVal
     */
    public void setpointNum(int newVal){
            pointNum = newVal;
    }
}