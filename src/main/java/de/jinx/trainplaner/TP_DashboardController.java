package de.jinx.trainplaner;

import de.jinx.trainplaner.components.ExerciseComponent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

public class TP_DashboardController {

    @FXML
    private FlowPane trainingContainer;

    @FXML
    private void initialize() {
        ExerciseComponent exerciseComponent = new ExerciseComponent();
        ExerciseComponent exerciseComponent1 = new ExerciseComponent();
        ExerciseComponent exerciseComponent2 = new ExerciseComponent();
        trainingContainer.getChildren().add(exerciseComponent);
        trainingContainer.getChildren().add(exerciseComponent1);
        trainingContainer.getChildren().add(exerciseComponent2);
    }
}
