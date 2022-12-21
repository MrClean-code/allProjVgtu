package org;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.util.Callback;
import model.*;
import model.Shapes;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private ListView listView;

    @FXML
    private ColorPicker colorPicker;
    @FXML
    private TextField textField1;
    @FXML
    private TextField textField2;

    private ObservableList<Shapes> items;
    @FXML
    private Canvas canvas;
    private int h, w;

    public void addShape(MouseEvent x) {
        h = Integer.parseInt(textField1.getText());
        w = Integer.parseInt(textField2.getText());

        System.out.println("H = " + h + " W " + w);

        GraphicsContext gr = canvas.getGraphicsContext2D();
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int a = listView.getSelectionModel().getSelectedIndex();

        Shapes new_figure = (Shapes) items.get(a).clone();
        Color color = colorPicker.getValue();

        gr.setFill(color);

        new_figure.DrawShape(gr, x.getX(), x.getY(), h, w);
    }

    public void initialize(ActionEvent actionEvent) {

        Rect rect = new Rect(50, 100);
        Circle circle = new Circle(100);
        Line line = new Line(100);

        items = FXCollections.observableArrayList(rect, circle, line);
        listView.setItems(items);

        listView.setCellFactory(new Callback<ListView<Shapes>, ListCell<Shapes>>() {
            @Override
            public ListCell<Shapes> call(ListView<Shapes> list) {
                return new ShapeCell();
            }
        });

        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void clear() {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        gr.clearRect(0, 0, 500, 500);
    }
}