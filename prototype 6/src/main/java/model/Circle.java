package model;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shapes {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void DrawShape(GraphicsContext gc, double start_x, double start_y, int h, int w) {
        if (h == 0 && w == 0) {
            gc.fillOval(start_x, start_y, this.radius, this.radius);
            System.out.println("circle " + this.radius);
        } else {
            gc.fillOval(start_x, start_y, h, w);
            System.err.println("color " + gc.getFill());
        }
    }
}



