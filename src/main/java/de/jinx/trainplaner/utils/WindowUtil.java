package de.jinx.trainplaner.utils;

import de.jinx.trainplaner.TP_Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowUtil {
    public static Stage createWindow(String title, String res, Modality mod){
        Stage window = new Stage();
        window.setTitle(title);
        //Create view from FXML
        FXMLLoader loader = new FXMLLoader(WindowUtil.class.getResource(res));

        //Set view in window
        try {
            window.setScene(new Scene(loader.load()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        window.initModality(mod);
        //Launch
        window.show();
        return window;
    }
}
