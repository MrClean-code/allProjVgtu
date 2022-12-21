module babaev.fabric {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org to javafx.fxml;
    exports org;
}