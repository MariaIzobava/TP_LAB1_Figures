package System;


import java.awt.*;
import java.util.ArrayList;

public class Polygon extends Figure2D {

	protected ArrayList<Point> points;

	public Polygon(){

	}

	public void draw(){

	}

	public ArrayList<Point> getpoints(){
		return points;
	}

	/**
	 * 
	 * @param p1
	 */
	public void move(Point p1){

	}

	public void setcenter(){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setpoints(ArrayList<Point> newVal){
		points = newVal;
	}
}//end Polygon