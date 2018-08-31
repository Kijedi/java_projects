/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wesleyshop;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class WesleyShop extends Application  { 
    
    String Username1, Password1;
    
    @Override
    public void start(Stage primaryStage) {
        
        //window title
        StackPane root = new StackPane();        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Admin Log In");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //setting the fields
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));
        
        Scene scene1 = new Scene(grid, 300,275);
        primaryStage.setScene(scene1);        
        
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("TAhoma",FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userName = new Label("User Name");
        grid.add(userName, 0, 1);
        
        TextField userTextField = new TextField();        
        grid.add(userTextField, 1, 1);
        
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        
        PasswordField password = new PasswordField();
        grid.add(password, 1, 2);
        
        //button1
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);         
        
        
        final Text actiontarget = new Text();
                grid.add(actiontarget, 1, 6);
        
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        public void handle(ActionEvent e) {
            
            String username1 = userTextField.getText();
            String password1 = password.getText();
            
            System.out.println(username1);
          

        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String host = "jdbc:mysql://localhost:3306/WesleyEnterprise?autoReconnect=true&useSSL=false";
            String uName = "root";
            String uPass = "wesleigh#1";

            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stmt = con.createStatement();
            String SQL = "SELECT * from User";
            ResultSet rs = stmt.executeQuery(SQL);

           if(rs.next()) { 
               String username = rs.getString("Email"); 
               String password = rs.getString("Password");
               System.out.println(username);
               System.out.println(password);
            }
           
        }
        catch (SQLException err) {
            System.out.println(err.getMessage());
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(WesleyShop.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
});
        
           
    }
    public static void main(String[] args){
        launch(args);
    }
    
}
