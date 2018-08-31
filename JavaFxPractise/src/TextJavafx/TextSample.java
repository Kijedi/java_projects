package TextJavafx;/**
 * Created by kijedi on 3/17/18.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.collections.ObservableList;
import javafx.scene.Group;

public class TextSample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        //creating a text object
        Text text = new Text();

        //set font
        text.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, FontPosture.REGULAR,20));

        //set colour
        text.setFill(Color.BLUEVIOLET);

        //set stroke
        text.setStrokeWidth(2);

        //set stroke color
        text.setStroke(Color.ALICEBLUE);

        //set postion of text
        text.setX(100);
        text.setY(150);

        //set text
        text.setText("Welcome to JavaFX");

        //stroke text
        text.setStrikethrough(true);

        //underline
        text.setUnderline(true);
        
        //group
        Group root = new Group();

        //retrieving the observable list object
        ObservableList list = root.getChildren();

        //setting the text object as a node to the group object
        list.add(text);

        //scene
        stage.setScene(new Scene(root,600, 300));

        //title
        stage.setTitle("Text Sample");

        //show
        stage.show();


    }
}
