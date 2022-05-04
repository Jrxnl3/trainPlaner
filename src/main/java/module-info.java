module de.jinx.trainplaner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.google.gson;

    opens de.jinx.trainplaner.obj to com.google.gson, javafx.base;
    opens de.jinx.trainplaner to javafx.fxml, com.google.gson;
    opens de.jinx.trainplaner.components to javafx.fxml;

    exports de.jinx.trainplaner;
    exports de.jinx.trainplaner.components;
    exports de.jinx.trainplaner.controllers;
    opens de.jinx.trainplaner.controllers to javafx.fxml;
}