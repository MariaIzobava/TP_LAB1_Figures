package fig;

import java.awt.Color;


/**
 * @author drozdms
 * @version 1.0
 * @created 10-Mar-2019 11:55:51 PM
 */
public abstract class Figure2D extends Figure {

	protected Color fillColor;

	public Figure2D(Color b, Color f) {
            borderColor = b;
            fillColor = f;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public Color getFillColor(){
		return fillColor;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFillColor(Color newVal){
		fillColor = newVal;
	}
}//end Figure2D