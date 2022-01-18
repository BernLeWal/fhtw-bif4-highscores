package highscores;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // reminder: https://openjfx.io/openjfx-docs/#install-javafx
        // Parent is a base-class of GridPane
        Parent root = FXMLLoader.load(getClass().getResource("/highscores/main.fxml"));
        primaryStage.setTitle("Highscore");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.setMinWidth(400);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
