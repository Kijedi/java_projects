package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button selector = new Button("words selector");
        Button clear = new Button("clear");
        Button exit = new Button("exit");
        ListView<String> list1 = new ListView();

            //setting positions
            GridPane gridpane = new GridPane();

            gridpane.setPadding(new Insets(5));
            gridpane.setHgap(10);
            gridpane.setVgap(10);
            gridpane.add(selector, 0, 0);
            gridpane.add(clear, 0, 2);
            gridpane.add(exit, 1, 2);
            gridpane.add(list1, 0, 1);


            //exit button to close the application
            exit.setOnAction(e -> Platform.exit());

            selector.setOnAction(e ->{

                list1.getItems().add("word1:meaning of word 1");
                list1.getItems().add("word2:meaning of word 2");
                list1.getItems().add("word3:meaning of word 3");
                list1.getItems().add("word4:meaning of word 4");
                list1.getItems().add("word5:meaning of word 5");

            });

            //clear button to reset the application to default view
            clear.setOnAction(e -> {
                list1.getItems().clear();
            });

        primaryStage.setTitle("Kamusi ya Kiswahili");
        primaryStage.setScene(new Scene(gridpane, 400, 300));
        primaryStage.show();

        }

        public static void main(String[] args) {launch(args);}
    }

