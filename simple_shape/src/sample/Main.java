package sample;

/*
    KIJEDI WESLEY
    S13/09710/15
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        //Drawing a Rectangle
        Rectangle rectangle = new Rectangle(150.0f, 75.0f, 300.0f, 150.0f);
        //Setting the properties of the rectangle
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        //Drawing 2 circles
        Circle circle1 = new Circle(150.0f, 225.0f, 70.0f);
        Circle circle2 = new Circle(450, 225.0f, 70.0f);

        circle1.setFill(Color.TRANSPARENT);
        circle1.setStroke(Color.BLACK);
        circle2.setFill(Color.TRANSPARENT);
        circle2.setStroke(Color.BLACK);

        //Creating a Group object
        Group root = new Group(rectangle, circle1, circle2);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Rectangle intersecting with 2 circles");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
