package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {

    private int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public void DrawShape(GraphicsContext gc, double startX, double startY, int h, int w) {
        if (h == 0 && w == 0) {
            gc.strokeLine(startX, startY, this.length, startY);
            System.out.println("line " + this.length);
        } else {
            gc.strokeLine(startX, startY, h, w);
            System.err.println("color " + gc.getFill());
        }
    }
}