package Effects;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * Created by kijedi on 3/19/18.
 */
public class ColorAdjustEffectExample extends Application {

    public static void main(String args[]){
        launch(args);
    }
   @Override
    public void start(Stage stage){
       //creating an imagee
       Image image = new Image("pictures/pic.jpg");

       //setting the image view
       ImageView imageview = new ImageView(image);

       //setting the position of the image
       imageview.setX(100);
       imageview.setY(70);

       //setting the fit height and width of the image view
       imageview.setFitHeight(200);
       imageview.setFitWidth(400);

       //setting the preserve ratio of the image view
       imageview.setPreserveRatio(true);

       //Instatiating the effect class
       ColorAdjust colorAdjust = new ColorAdjust(0.0,0.8,0.5,0.7);

       Glow glow = new Glow();
       glow.setLevel(0.9);

       //Animation
       FadeTransition fade = new FadeTransition(Duration.millis(1000));

       fade.setNode(imageview);
       fade.setFromValue(1.0);
       fade.setToValue(3.0);
       fade.setCycleCount(50);
       fade.setAutoReverse(false);

       fade.play();


       //Applying coloradjust effect to the ImageView node
       imageview.setEffect(colorAdjust);
       imageview.setEffect(glow);


       //creating a Group object
       Group root = new Group(imageview);

       //creating a scene
       Scene scene = new Scene(root, 600, 300);

       //setting the title
       stage.setTitle("Image Effect");

       //adding scene to the stage
       stage.setScene(scene);

       //showing the stage
       stage.show();


   }
}
