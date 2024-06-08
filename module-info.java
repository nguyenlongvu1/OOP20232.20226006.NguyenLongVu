module GUIProject {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;
    requires java.desktop;
    requires javafx.graphics;
    opens GUIProject.hust.soict.ict.javafx to javafx.fxml;
    exports GUIProject.hust.soict.ict.javafx to javafx.graphics;
}
