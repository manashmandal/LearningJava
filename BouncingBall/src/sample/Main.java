package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BallPane ballPane = new BallPane();

        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());

        ballPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP){
                ballPane.increaseSpeed();
            } else if (e.getCode() == KeyCode.DOWN){
                ballPane.decreaseSpeed();
            }
        });


        Scene scene = new Scene(ballPane, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
        ballPane.requestFocus();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
