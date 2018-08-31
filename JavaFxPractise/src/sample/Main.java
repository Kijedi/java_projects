package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       //creating a group
        Group group = new Group();

        //creating a scene by passing the group object, height and width
        Scene scene = new Scene(group, 600,300);

        //setting color to the scene
        scene.setFill(Color.LIGHTSEAGREEN);

        //setting the stage title
        primaryStage.setTitle("Sample Application");

        //adding scene to the stage
        primaryStage.setScene(scene);

        //displaying the contents of the stage
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
