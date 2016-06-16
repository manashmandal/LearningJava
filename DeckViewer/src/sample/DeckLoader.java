package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;


//D:\GitHub\LearningJava\DeckViewer\cardimage\1 (" + String.valueOf(i+1) + ").png

/**
 * Created by Manash on 6/14/2016.
 */
public class DeckLoader extends Pane {
    private ArrayList <ImageView> imageViews;

    private int maxHeight;
    private int maxWidth;

    private Button refreshButton;
    private HBox cardHBox;
    private HBox buttonHBox;
    private VBox componentBox;

    DeckLoader(){
        //Init
        imageViews = new ArrayList<>();

        //Layouts
        cardHBox = new HBox();
        buttonHBox = new HBox();
        componentBox = new VBox();

        cardHBox.setSpacing(10);

        //Adding button to button box
        refreshButton = new Button("Refresh");
        buttonHBox.getChildren().add(refreshButton);
        buttonHBox.setAlignment(Pos.BOTTOM_CENTER);

        //Adding property
        componentBox.prefHeightProperty().bind(heightProperty());
        componentBox.prefWidthProperty().bind(widthProperty());

        buttonHBox.setPadding(new Insets(10, 10, 10, 10));

        componentBox.getChildren().addAll(cardHBox, buttonHBox);

        cardHBox.prefHeightProperty().bind(componentBox.heightProperty().subtract(refreshButton.getHeight()));
        cardHBox.prefWidthProperty().bind(componentBox.widthProperty());


        loadFiles();

        getChildren().add(componentBox);
    }

    private void loadFiles(){
        for (int i = 0; i < 67; i++){
            File imageFile = new File("D:\\GitHub\\LearningJava\\DeckViewer\\cardimage\\1 (" + String.valueOf(i+1) + ").png");
            Image image = new Image(imageFile.toURI().toString());
            imageViews.add(new ImageView(image));
        }
    }

    public void setSizeProperty(){
        for (ImageView imageView : imageViews){
            imageView.fitWidthProperty().bind(componentBox.widthProperty().divide(4));
            imageView.fitHeightProperty().bind(cardHBox.heightProperty().subtract(refreshButton.getHeight()));
//            imageView.setFitWidth(100);
        }
    }

    public void loadCards(){
        cardHBox.getChildren().add(imageViews.get(0));
    }
}
