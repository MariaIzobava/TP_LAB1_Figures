package System;

import java.awt.*;
import java.util.ArrayList;

public class PolygonalChain {

	private ArrayList<Segment> segments;

	public PolygonalChain(){

	}

	public void draw(){

	}

	public ArrayList<Segment> getsegments(){
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
	public void setsegments(ArrayList<Segment> newVal){
		segments = newVal;
	}
}//end PolygonalChain