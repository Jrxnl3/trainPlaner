package de.jinx.trainplaner;

import de.jinx.trainplaner.components.ExerciseComponent;
import de.jinx.trainplaner.obj.Model;
import de.jinx.trainplaner.utils.WindowUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;

public class TP_DashboardController {

    @FXML
    private FlowPane trainingContainer;

    @FXML
    private ListView<String> scheduleList;

    @FXML
    private void initialize() {
        Model.getAllExercises().forEach( e->{
            ExerciseComponent exComp = new ExerciseComponent(e);
            trainingContainer.getChildren().add(exComp);
        });
    }

    @FXML
    void newExercise(ActionEvent event) {
        WindowUtil.createWindow("Create new Exercise", "/de/jinx/trainplaner/createExercise.fxml", Modality.APPLICATION_MODAL);
    }
}
