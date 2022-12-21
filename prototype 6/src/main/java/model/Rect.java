package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rect extends Shapes {
    private int length;
    private int height;


    public Rect(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void DrawShape(GraphicsContext gc, double start_x, double start_y, int h, int w) {
        if (h == 0 && w == 0) {
            gc.fillRect(start_x, start_y, this.length, this.height);
            System.out.println("rect " + this.length + " " + this.height);
        } else {
            gc.fillRect(start_x, start_y, h, w);
            System.err.println("color " + gc.getFill());
        }
    }
}