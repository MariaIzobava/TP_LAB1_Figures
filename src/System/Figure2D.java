package System;


import java.awt.*;

public abstract class Figure2D extends Figure {

	protected Color fillColor;

	public Figure2D(){

	}

	public Color getfillColor(){
		return fillColor;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfillColor(Color newVal){
		fillColor = newVal;
	}
}//end Figure2D