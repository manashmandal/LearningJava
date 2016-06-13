package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    private CirclePane circlePane = new CirclePane();


    @Override
    public void start(Stage primaryStage) throws Exception{


        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button buttonEnlarge = new Button("Enlarge");
        Button buttonShrink = new Button("Shirnk");

        buttonEnlarge.setOnMouseClicked(new EnlargeHandler());
        buttonShrink.setOnMouseClicked(new ShrinkHandler());

        hBox.getChildren().add(buttonEnlarge);
        hBox.getChildren().add(buttonShrink);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);

        borderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(borderPane, 200, 150);
        primaryStage.setTitle("Control Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class EnlargeHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e){
            circlePane.enlarge();
        }
    }

    class ShrinkHandler implements EventHandler <MouseEvent> {
        @Override
        public void handle(MouseEvent e){
            circlePane.shrink();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

class CirclePane extends StackPane{
    private Circle circle = new Circle(50);

    public CirclePane(){
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    public void enlarge(){
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink(){
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }
}
