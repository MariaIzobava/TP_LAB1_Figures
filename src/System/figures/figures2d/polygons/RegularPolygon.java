package System.figures.figures2d.polygons;

public class RegularPolygon extends Polygon {
    protected int pointNum;

    public RegularPolygon() {

    }

    public int getPointNum() {
        return pointNum;
    }

    /**
     * @param newVal
     */
    public void setPointNum(int newVal) {
        pointNum = newVal;
    }
}//end RegularPolygon