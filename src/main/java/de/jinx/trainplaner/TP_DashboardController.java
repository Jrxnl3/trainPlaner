package de.jinx.trainplaner;

import de.jinx.trainplaner.components.ExerciseComponent;
import de.jinx.trainplaner.obj.Model;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;

public class TP_DashboardController {

    @FXML
    private FlowPane trainingContainer;

    @FXML
    private ListView<String> scheduleList;


    @FXML
    private void initialize() {
        /*
        ArrayList<MuscleGroups> tmpMuscles = new ArrayList<>();
        tmpMuscles.add(MuscleGroups.FOREARM);
        tmpMuscles.add(MuscleGroups.CALVE);

        ArrayList<ExerciseEntry> tmpEntries = new ArrayList<>();
        tmpEntries.add(new ExerciseEntry("20210906",2,10));

        Exercise pushUps = new Exercise(0,"Push Up","Kann ich *noch* nur auf Knien!",tmpMuscles,tmpEntries);
        Exercise kniebeugen = new Exercise(0,"Kniebeugen","Easy Peasy");
        Exercise diamondPush = new Exercise(0,"Diamond Push Up","Hilfe :/");

        TP_Main.getCfg().addExercise(pushUps);
        TP_Main.getCfg().addExercise(kniebeugen);
        TP_Main.getCfg().addExercise(diamondPush);
        TP_Main.getCfg().saveExercises();

        ExerciseComponent exerciseComponent = new ExerciseComponent(pushUps);
        ExerciseComponent exerciseComponent1 = new ExerciseComponent(kniebeugen);
        ExerciseComponent exerciseComponent2 = new ExerciseComponent(diamondPush);
        */
        Model.getAllExercises().forEach( e->{
            ExerciseComponent exComp = new ExerciseComponent(e);
            trainingContainer.getChildren().add(exComp);
        });

    }
}
