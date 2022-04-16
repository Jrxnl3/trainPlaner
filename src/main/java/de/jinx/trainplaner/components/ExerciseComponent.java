package de.jinx.trainplaner.components;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

import java.io.IOException;

public class ExerciseComponent extends AnchorPane {

    private Node view;
    private ExerciseController controller;

    public ExerciseComponent(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/jinx/trainplaner/exerciseComponent.fxml"));

        fxmlLoader.setControllerFactory(new Callback<Class<?>, Object>() {
            @Override
            public Object call(Class<?> param) {
                return controller = new ExerciseController();
            }
        });
        try {
            view = (Node) fxmlLoader.load();

        } catch (IOException ex) {
        }
        getChildren().add(view);
    }
}
