module com.example.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.gui to javafx.fxml;
    exports com.example.gui;
    exports com.example.gui.stage1;
    opens com.example.gui.stage1 to javafx.fxml;
}