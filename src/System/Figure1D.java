package System;


import java.awt.*;

public abstract class Figure1D extends Figure {

	private Point firstPoint;
	private Point secondPoint;

	public Figure1D(){

	}

	public Point getfirstPoint(){
		return firstPoint;
	}

	public Point getsecondPoint(){
		return secondPoint;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfirstPoint(Point newVal){
		firstPoint = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsecondPoint(Point newVal){
		secondPoint = newVal;
	}
}//end Figure1D