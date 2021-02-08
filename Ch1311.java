package ch.pkg13.pkg11;

import static java.lang.System.out;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*

   Programmer: Trent Giever
   Assignment Chapter: Ch 13 
   Purpose: JavaFX mouse events
   Date modified: 1/24/21
   IDE/Tool used: NetBeans 8.2

   */

public class Ch1311 extends Application {
    double amount =0; //holds double amount
    @Override
    public void start(Stage primaryStage) {
      
      final double SCENE_WIDTH = 650.0;
      final double SCENE_HEIGHT = 250.0;

      //penny
      Image image1 = new Image("file:Penny.png");
      ImageView penny = new ImageView(image1);
      penny.setOnMouseClicked(event-> {
           addAmount(.01);
           out.println(amount);
    });
      //nickel
       Image image2 = new Image("file:Nickel.png");
      ImageView nickel = new ImageView(image2);
      nickel.setOnMouseClicked(event-> {
           addAmount(.05);
           out.println(amount);
    });
      //dime
       Image image3 = new Image("file:Heads2.png");
      ImageView dime = new ImageView(image3);
      dime.setFitHeight(115);
      dime.setFitWidth(115);
      dime.setOnMouseClicked(event-> {
           addAmount(.10);
           out.println(amount);
    });
      //quarter
     Image image4 = new Image("file:Quarter.png");
      ImageView quarter = new ImageView(image4);
      quarter.setOnMouseClicked(event-> {
           addAmount(.25);
           out.println(amount);
    });
      //HBox for images
      HBox hbox = new HBox(25,penny,nickel,dime,quarter);
      //add button and output box
      Label output = new Label();
      Button calc = new Button("Calculate Total");
      calc.setOnAction(event -> {
          if(amount == 1.00 )//i equals to one dollar
            output.setText("Amount: " + amount + ", This adds up to a whole dollar");
          else//does not equal to a dollar
            output.setText("Amount: " + amount + ", This does NOT add up to whole dollar");
      });
      VBox vbox = new VBox(20, hbox,output,calc);
     
      Scene scene = new Scene(vbox, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
    
    }
    
    public void addAmount(double amount)//increases ammount to get arround final variables
    {
        this.amount += amount;
    }
  
    public static void main(String[] args) {
        launch(args);
    }
    
}
