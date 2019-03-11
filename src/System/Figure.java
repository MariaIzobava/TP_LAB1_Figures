package System;

import java.awt.*;

public abstract class Figure {

	protected Color borderColor;
	protected Point center;

	public Figure(){

	}

	public abstract void draw();

	public Color getborderColor(){
		return borderColor;
	}

	public Point location(){
		return null;
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
	public void setborderColor(Color newVal){
		borderColor = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcenter(Point newVal){
		center = newVal;
	}
}//end Figure