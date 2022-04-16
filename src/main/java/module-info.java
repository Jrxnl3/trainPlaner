module de.jinx.trainplaner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens de.jinx.trainplaner to javafx.fxml;
    opens de.jinx.trainplaner.components to javafx.fxml;
    exports de.jinx.trainplaner;
    exports de.jinx.trainplaner.components;
}