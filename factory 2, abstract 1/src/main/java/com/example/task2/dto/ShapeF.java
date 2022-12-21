package com.example.task2.dto;

import com.example.task2.model.Shape;

public class ShapeF {

    public Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case "1":
                shape = new FourSides();
                break;
            case "2":
                shape = new CircleSides();
                break;
            case "3":
                shape = new SixSidex();
                break;
        }
        return shape;
    }
}
