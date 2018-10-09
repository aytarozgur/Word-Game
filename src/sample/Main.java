package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    public Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Word Game");
        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }

}
