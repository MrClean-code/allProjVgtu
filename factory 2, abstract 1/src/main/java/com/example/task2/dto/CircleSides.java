package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CircleSides extends Shape {

    private final double width = 50;
    private final double height = 60;
    @Override
    public void draw(GraphicsContext grC, Color color) {
        grC.setFill(color);
        grC.fillOval(30, 40, width, height);
        grC.setLineWidth(5);
        grC.setStroke(Color.BROWN);
    }

    @Override
    public double square() {
        return  Math.PI * width * height;
    }
}
