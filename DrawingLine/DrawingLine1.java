package DrawingLine;/**
 * Created by kijedi on 3/17/18.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import  javafx.scene.Group;
import  javafx.scene.Scene;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //creating a line object
        Line line = new Line();

        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);

        //group
        Group group = new Group(line);

        //scene
        Scene scene = new Scene(group, 600, 300);


        //title
        primaryStage.setTitle("Sample Application");

        //add scene to stage
        primaryStage.setScene(scene);

        //show
        primaryStage.show();


    }
}
