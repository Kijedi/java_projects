package sample;

/**
 *S13/09710/15
 * KIJEDI WESLEY
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        MilesAndKiloPane pane = new MilesAndKiloPane();

        primaryStage.setTitle("Miles to KIlometre Calculator");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }

    private class MilesAndKiloPane extends GridPane {

        Label lblMiles = new Label("Mile:");
        Label lblKilometers = new Label("Kilometers:");
        Button convert = new Button("convert");
        TextField tfMiles = new TextField();
        TextField tfKilometers = new TextField();


        private MilesAndKiloPane() {

            setHgap(10);
            setVgap(10);
            setPadding(new Insets(10, 10, 10, 10));

            add(lblMiles, 0, 0);
            add(tfMiles, 1, 0);
            add(lblKilometers, 0, 1);
            add(tfKilometers, 1, 1);
            add(convert, 1, 2);

            tfMiles.setText("0");
            tfMiles.setAlignment(Pos.CENTER_RIGHT);
            tfKilometers.setText("0");
            tfKilometers.setAlignment(Pos.CENTER_RIGHT);

            convert.setOnAction(event -> {

                tfKilometers.setText(Double.toString(new Double(tfMiles.getText()) * 0.621371));

            });

        }
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}