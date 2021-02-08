
package ch.pkg13.pkg2;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*

   Programmer: Trent Giever
   Assignment Chapter: 13
   Purpose: Demo JavaFX knowledge
   Date modified: 1/15/21
   IDE/Tool used: NetBeans 8.2

   */

public class Ch132 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        final double CENTER_X = 300; //center point of tree
        final double CENTER_Y = 300; //center point of tree
        Circle year1 = new Circle(CENTER_X,CENTER_Y,25,Color.SANDYBROWN); //1st year of growth
        year1.setStroke(Color.BLACK);//boarder of black
        Text text1 = new Text(305,305,"1"); //display one year
        Circle year2 = new Circle(CENTER_X,CENTER_Y,75,Color.SANDYBROWN);//2nd year of growth
        year2.setStroke(Color.BLACK);//boarder of black
        Text text2 = new Text(340,340,"2");//display two years
        Circle year3 = new Circle(CENTER_X,CENTER_Y,125,Color.SANDYBROWN);//3rd year od growth
        year3.setStroke(Color.BLACK);//boarder of black
        Text text3 = new Text(370,370,"3");//display three years
        Circle year4 = new Circle(CENTER_X,CENTER_Y,175,Color.SANDYBROWN); //4th year old growth
        year4.setStroke(Color.BLACK);//boarder of black
        Text text4 = new Text(400,400,"4");//display four years
        Circle year5 = new Circle(CENTER_X,CENTER_Y,225,Color.SANDYBROWN);//5th year
        year5.setStroke(Color.BLACK);//black ring
        Text text5 = new Text(450,450,"5");//draw a 5
        Pane pane = new Pane(year5,year4,year3,year2,year1,text1,text2,text3,text4,text5);//adds everything to pane
        Scene scene = new Scene(pane, 600, 600);//display the scene
        
        primaryStage.setTitle("Tree Growth");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
