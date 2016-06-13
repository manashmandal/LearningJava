package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button newButton = new Button("New");
        Button openButton = new Button("Open");
        Button saveButton = new Button("Save");
        Button printButton = new Button("Print");

        hBox.getChildren().addAll(newButton, openButton, saveButton, printButton);

        newButton.setOnAction((ActionEvent e)->{
            System.out.println("New");
        });

        openButton.setOnAction((ActionEvent e)->{
            System.out.println("Open");
        });

        saveButton.setOnAction((ActionEvent e) -> {
            System.out.println("Save");
        });

        printButton.setOnAction((ActionEvent e)->{
            System.out.println("Print");
        });

        Scene scene = new Scene(hBox, 300, 50);
        primaryStage.setTitle("Anonymous Handler Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
