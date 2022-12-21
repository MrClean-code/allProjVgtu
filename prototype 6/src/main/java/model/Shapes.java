package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.lang.Cloneable;

public abstract class Shapes implements Cloneable {
    protected Color color;
    private int h;
    private int w;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void DrawShape(GraphicsContext gc, double startX, double startY, int h, int w);

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


}
