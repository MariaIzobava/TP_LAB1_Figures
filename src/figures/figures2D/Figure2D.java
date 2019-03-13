package figures.figures2D;

import figures.Figure;

import java.awt.Color;

public abstract class Figure2D extends Figure {

    protected Color fillColor;

    public Figure2D(Color b, Color f) {
        borderColor = b;
        fillColor = f;
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color newVal) {
        fillColor = newVal;
    }
}