package com.example.task2.dto;


import com.example.task2.model.Shape;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SixSidex extends Shape {

    private double[] x_cords;
    private double[] y_cords;
    @Override
    public void draw(GraphicsContext grC, Canvas canvas, Color color) {

        x_cords = new double[4];
        y_cords = new double[4];

        for (int i = 0; i < 4; ++i) {
            x_cords[i] = 150 * Math.cos(2 * Math.PI * i / 6) + canvas.getHeight() / 2;
            y_cords[i] = 150 * Math.sin(2 * Math.PI * i / 6) + canvas.getWidth() / 2;
        }

        grC.setFill(color);
        grC.fillPolygon(x_cords, y_cords, x_cords.length);
    }

    @Override
    public double square() {
        return (x_cords.length * (x_cords[0] * y_cords[0])) / (4.0 * Math.tan((Math.PI / x_cords.length)));
    }
}
