package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ShapeCell extends ListCell<Shapes> {

    @Override
    public void updateItem(Shapes item, boolean empty) {
        super.updateItem(item, empty);

        if (item != null) {
            Canvas canvas = new Canvas();
            canvas.setHeight(150);
            canvas.setWidth(150);

            GraphicsContext gr = canvas.getGraphicsContext2D();
            Shapes item2 = (Shapes) item.clone();
            item2.DrawShape(gr, 1, 1, 0, 0);
            setGraphic(canvas);
        }
    }
}