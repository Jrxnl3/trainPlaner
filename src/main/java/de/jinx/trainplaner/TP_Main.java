package de.jinx.trainplaner;

import de.jinx.trainplaner.obj.Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TP_Main extends Application {

    private static Model model;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TP_Main.class.getResource("tp_dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 400);
        stage.setTitle("Training Schedule!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        model = new Model();

        launch();
    }

    public static Model getModel() {
        return model;
    }
}