package com.example.task2;

import com.example.task2.dto.*;
import com.example.task2.model.Shape;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Label text;
    @FXML
    private Button delete;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private TextField textField;
    @FXML
    private TextField textField2;
    @FXML
    private Canvas canvas = new Canvas(300, 300);
    private GraphicsContext grC;
    private Shape shape;
    private ShapeF shapeF;

    @FXML
    protected void onHelloButtonClick() {
        grC = canvas.getGraphicsContext2D();
        shapeF = new ShapeF();
        shape = shapeF.getShape(textField2.getText());
        shape.setColor(colorPicker.getValue());

        // show this !!
        shape.draw(grC, canvas, shape.getColor());
        shape.draw(grC, shape.getColor());
        textField.setText(String.valueOf(shape.square()));
    }

    @FXML
    protected void delete() {
        grC.clearRect(0, 0, 700, 800);
        delete.setOnMouseClicked(mouseEvent -> {
            text.setText("All deleted");
        });
    }
}