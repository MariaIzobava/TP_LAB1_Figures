package System;

public class RegularPolygon extends Polygon {

	protected int pointNum;

	public RegularPolygon(){

	}

	public int getpointNum(){
		return pointNum;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setpointNum(int newVal){
		pointNum = newVal;
	}
}//end RegularPolygon