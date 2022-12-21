package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FourSides extends Shape {

    private final double width = 50;
    private final double height = 50;

    @Override
    public void draw(GraphicsContext grC, Color color) {
        grC.setFill(color);
        grC.setLineWidth(4);
        grC.setStroke(Color.SILVER);
        grC.fillRect(30, 140, width, height);
    }

    @Override
    public double square() {
        return width * height;
    }

}
