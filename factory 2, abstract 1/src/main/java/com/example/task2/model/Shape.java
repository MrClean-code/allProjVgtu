package com.example.task2.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public abstract class Shape {
    private Color color;
    private double height;
    private double weight;
    private double square;

    public void draw(GraphicsContext grC, Canvas canvas, Color color) {};
    public void draw(GraphicsContext grC, Color color) {};

    public double square() {
        return square;
    };

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
