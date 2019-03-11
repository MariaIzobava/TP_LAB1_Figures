package System;

import java.awt.*;

public class SymmetricFigure extends Polygon {

	protected Point firstPoint;
	protected Point secondPoint;

	public SymmetricFigure(){

	}

	public Point getfirstPoint(){
		return firstPoint;
	}

	public Point getsecondPoint(){
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
}//end SymmetricFigure