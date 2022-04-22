package de.jinx.trainplaner.components;

import de.jinx.trainplaner.obj.Exercise;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ExerciseComponent extends AnchorPane {

    private Node view;
    private ExerciseCompCon controller;

    public ExerciseComponent(Exercise übung){
        //INITILIZATION OF COMPONENT
        //Loader + Controller
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/jinx/trainplaner/exerciseComponent.fxml"));
        fxmlLoader.setControllerFactory(param -> controller = new ExerciseCompCon());

        //load view
        try {
            view = fxmlLoader.load();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //Do Constructor Items
        controller.instantiate(übung);

        getChildren().add(view);
    }
}
