package ch.pkg13.pkg3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*

   Programmer: Trent Giever
   Assignment Chapter: 13
   Purpose: Demo JavaFX knowledge
   Date modified: 1/15/21
   IDE/Tool used: NetBeans 8.2

   */

public class Ch133 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //make polyline
        Polyline star = new Polyline(50,200,150,200,
                                    150,200,200,100,
                                    200,100,250,200,
                                    250,200, 350,200,
                                    350, 200, 250,275,
                                    250,275, 300,375,
                                    300,375, 195, 275,
                                    195,275,150,375,
                                    150, 375, 150,275,
                                    150,275,50,200);
        Text name = new Text(185,250,"Trent"); //Text for name
        Pane pane = new Pane(name,star);//add everything to screen
        Scene scene = new Scene(pane, 700, 700);//creates the scene
        
        primaryStage.setTitle("Hollywood Star");//sets the title
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }  
}
