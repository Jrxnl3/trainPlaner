package de.jinx.trainplaner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TP_DashboardController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}