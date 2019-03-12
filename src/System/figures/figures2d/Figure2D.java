package System.figures.figures2d;


import System.figures.Figure;

import java.awt.*;

public abstract class Figure2D extends Figure {
    protected Color fillColor;

    public Figure2D() {

    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * @param newVal
     */
    public void setFillColor(Color newVal) {
        fillColor = newVal;
    }
}//end Figure2D