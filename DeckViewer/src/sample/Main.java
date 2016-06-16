package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.print.DocFlavor;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.File;
import java.net.URI;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane pane = new Pane();
        DeckLoader loader = new DeckLoader();
        Scene scene = new Scene(loader, 500, 500);
        loader.setSizeProperty();
        loader.loadCards();

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
