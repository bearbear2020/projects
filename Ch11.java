
package ch.pkg11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
/*

   Programmer: Trent Giever
   Assignment Chapter: 11
   Purpose: Distance around the park
   Date modified: 1/8/2021
   IDE/Tool used: NetBeans 8.2

   */
public class Ch11 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //add an image
        Image image = new Image("file:bear-waving.png");
        ImageView bearimage = new ImageView(image);
        //label
        Label prompt = new Label("Enter the distance around the park");
        //text field
        TextField inputTextField = new TextField();
        //output text box
        Label calcResult = new Label();
        //button
        Button button = new Button();
        button.setText("Click to Calculate");
        button.setOnAction(event -> { //button event
            double miles = Double.parseDouble(inputTextField.getText()); //enter in the miles/distance
            double time = miles / 5; //10 MPH for a slow drive around
            calcResult.setText(String.format("%,.1f hour(s)", time)); //print the time on the screen
        });
        HBox hbox = new HBox(10,prompt,inputTextField); //hbox for the label and textinput
        VBox vbox = new VBox(10, bearimage, hbox, button,calcResult); // vbox to structure everything
        Scene scene = new Scene(vbox, 400, 150); //sets the scene
        
        primaryStage.setTitle("Distance"); //sets title
        primaryStage.setScene(scene); //sets the scene
        primaryStage.show(); //show the stage
    }

   
    public static void main(String[] args) {
        launch(args); //launch the gui
    }
    
}
