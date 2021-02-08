
package project;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*

   Programmer: Trent Giever
   Assignment Chapter: Project      

   */
public class Project extends Application 
{
    boolean passwdBtnClicked = false;
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException, IOException
    {
        //createFile();
       //text area to explain what the purpose of this program is
         TextArea textarea = new TextArea();
        textarea.setWrapText(true);
        textarea.setText("A stron password is a non dictionary password that consists of a minimum of 15 characters long. Also, it contains one number, an uppercase letter, and a special character. Mr. Hunter uses a method using a tool to help him create each password. This game shows youb how. The game will beed an imput of your selections below.");
        textarea.setPrefRowCount(7);
        textarea.setPrefColumnCount(20);
        textarea.setMaxWidth(400);
        textarea.setMaxHeight(500);
        textarea.setFont(new Font(14));
        //hbox for text area
        HBox textbox = new HBox(10,textarea);
        textbox.setAlignment(Pos.TOP_CENTER);
        //label above the listviews
        Label prompt = new Label("Select a phrase, a number, and special character");
        prompt.setFont(new Font(18));
        prompt.setAlignment(Pos.BOTTOM_CENTER);
        RandomAccessFile reader = new RandomAccessFile("phrases.dat","r");
        ListView<String> phrasesList = new ListView<>();
        phrasesList.setMaxHeight(200);
        phrasesList.setMaxWidth(200);
        for(int i =0; i < 15; i++)
        {
            String temp = "";
            int pos = reader.readInt();
            for(int j = 0; j < pos; j++)
                temp += reader.readChar();
            phrasesList.getItems().add(temp);
        }
        reader.close();
        //second do the numbers file, amd add all the elements to the list
        RandomAccessFile nums = new RandomAccessFile("nums.dat","r");
        ListView<String> numsList = new ListView<>();
        numsList.setMaxHeight(200);
        numsList.setMaxWidth(75);
        for(int i =0; i < 10; i++)
        {
            String num = Integer.toString(nums.readInt());
            numsList.getItems().add(num);
        }
        nums.close();
        //lastly do the characters file, and add all the elements to the list
        RandomAccessFile chars = new RandomAccessFile("chars.dat","r");
        ListView<String> charsList = new ListView<>();
        charsList.setMaxHeight(200);
        charsList.setMaxWidth(100);
        for(int i =0; i < 30; i++)
        {
            String temp = String.valueOf(chars.readChar());
             charsList.getItems().add(temp);
        }
       
         
        chars.close();
          //button to display random password
        Password password = new Password();
        Button passwordBtn = new Button("Create a strong password");
        passwordBtn.setMinWidth(100);
        passwordBtn.setMinHeight(20);
        //label to output the random characters
        Label passwordText = new Label();
        passwordText.setFont(new Font(14));
        passwordText.setTextFill(Color.RED);
        //label to display the count
        Label passwordNum = new Label("Password #:   ");
        passwordNum.setFont(new Font(14));
        passwordNum.setTextFill(Color.BLUE);
        //action event when button is clicked to generate and display the new password
        passwordBtn.setOnAction(event -> {
                if(phrasesList.getSelectionModel().getSelectedIndex() != -1 && numsList.getSelectionModel().getSelectedIndex() != -1 && charsList.getSelectionModel().getSelectedIndex() !=-1) //all 3 lists are selected
                {
                    passwordText.setText(password.makePassword());
                    passwordNum.setText("Password #:  " + password.passwordCount());
                    passwdBtnClicked = true;
                }
                else
                {
          JOptionPane.showMessageDialog(new JFrame(), "Please select one item in each list", "Error", JOptionPane.ERROR_MESSAGE);//hint 
    }
        
        });
        //button for second screen
        Button next = new Button("Next");
        next.setMinWidth(100);
        next.setMinHeight(20);
        next.setOnAction(event -> {
        if(passwdBtnClicked)
        {
            secondWindow(password);
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(), "Please create at least on password before continued", "Error", JOptionPane.ERROR_MESSAGE);//hint 
        }
        
        });
        
         //create VBox for right Side content
        VBox rightSide = new VBox(20,passwordBtn, passwordText,passwordNum,next);
        rightSide.setAlignment(Pos.CENTER);
        //left half hbox
        HBox boxes = new HBox(10,phrasesList,numsList,charsList,rightSide);
        //add left and right  together
        VBox phrasevbox = new VBox(10,prompt, boxes);
       //add together the top and bottom sections
        VBox vbox = new VBox(10,textbox,phrasevbox);
        Scene scene = new Scene(vbox,675,450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Password Help Screen");
        primaryStage.show();
    }
  public static void secondWindow(Password password)  
  {
        //Password Obj
        //Password password = new Password();
        //userScore obj, and HackerScore obj
        UserScore userscore = new UserScore();
        HackerScore hackerscore = new HackerScore();
        //The top element telling the user to enter their favorite phrase
        Label topHeader = new Label("Enter your favorite phrase (a minimum of 15 characters long)");
        topHeader.setFont(new Font(18));
        HBox topHeaderHBox = new HBox(10,topHeader);
        topHeaderHBox.setAlignment(Pos.CENTER);
        //user input box creation
        TextField phrase = new TextField();
        phrase.setPrefWidth(600);
        HBox phraseHBox = new HBox(10,phrase);
        phraseHBox.setAlignment(Pos.CENTER);
        //The length text
        Label lengthLabel = new Label("The length of your phrase is:   ");
        lengthLabel.setFont(new Font(14));
        HBox lengthHBox = new HBox(10,lengthLabel);
        lengthHBox.setAlignment(Pos.CENTER);
        
//set images and button
        
        //user image
        Image user = new Image("file:user.jpg");
        ImageView userImage = new ImageView(user);
        userImage.setFitHeight(100);
        userImage.setPreserveRatio(true);
        userImage.setRotate(180);
        //display the user and hacker score
        Label userScore = new Label("Your Score:  0");
        userScore.setFont(new Font(14));
        Label hackerScore = new Label("Hacker's Score:  0");
        hackerScore.setFont(new Font(14));
        HBox scoreHBox = new HBox(250,userScore,hackerScore);
        scoreHBox.setAlignment(Pos.CENTER);
        //text output
        Label outputLength = new Label();
        HBox outputHBox = new HBox(10,outputLength);
        outputHBox.setAlignment(Pos.CENTER);
        //determine length button
        Button checkLength = new Button("Check Length");
        checkLength.setFont(new Font(18));
        checkLength.setMinWidth(100);
        checkLength.setMinHeight(100);
        checkLength.setOnAction(event -> {
            String text = phrase.getText();
            if(!(text.equals("")))
            {
                int length = password.getLength(text);
                if(length >= 15)
                {
                    userscore.updateScore();
                    userScore.setText("Your Score: " + userscore.getScore());
                    outputLength.setText("Perfect Length!");
                    outputLength.setTextFill(Color.GREEN);
                 }
                else // less than 15
                {
                    hackerscore.updateScore();
                    hackerScore.setText("Hacker's Score: " + hackerscore.getScore());
                    outputLength.setText("Too Short!");
                    outputLength.setTextFill(Color.RED);
                }
                lengthLabel.setText("The length of your phrase is: " + length );
            }
            else
            {
                JOptionPane.showMessageDialog(new JFrame(), "Please enter a phrase to check", "Error", JOptionPane.ERROR_MESSAGE);//hint 
            }
                
        });
        //hacker image
        Image hacker = new Image("file:hacker.jpg");
        ImageView hackerImage = new ImageView(hacker);
        hackerImage.setFitHeight(100);
        hackerImage.setPreserveRatio(true);
        //hackerImage.setRotate(180);
        HBox buttonImages = new HBox(25,userImage,checkLength,hackerImage, scoreHBox);
        buttonImages.setAlignment(Pos.CENTER);
//generate password
        //label output for the button
        TextField output = new TextField();
        output.setPrefWidth(500);
        output.setEditable(false);
        output.setFont(new Font(14));
        //output.setText(password.getPassword());
        HBox generatedPasswordHBox = new HBox(10,output);
        generatedPasswordHBox.setAlignment(Pos.CENTER);
        //button
        Button generateButton = new Button("Get my Secret Password");
        generateButton.setFont(new Font(18));
        generateButton.setMinHeight(50);
        generateButton.setMinWidth(150);
        HBox generateButtonHBox = new HBox(10,generateButton);
        generateButtonHBox.setAlignment(Pos.CENTER);
        generateButton.setOnAction(event -> {
            output.setText(password.getPassword());
            
        });
 //save password
        //create the group box
        Label header = new Label("Answer the following question.");
        header.setFont(new Font(18));
        header.setTextFill(Color.RED);
        HBox headerHBox = new HBox(10,header);
        headerHBox.setAlignment(Pos.BOTTOM_CENTER);
        Label radioPrompt = new Label("What do you need to do with this password");
        radioPrompt.setFont(new Font(14));
        radioPrompt.setTextFill(Color.BLUE);
        //copy/paste radio button
        RadioButton copyPaste = new RadioButton("Copy and Paste it");
        copyPaste.setFont(new Font(14));
        copyPaste.setTextFill(Color.RED);
        copyPaste.setOnAction(event -> {
            password.copyToClipBoard();
        });
        //copy to paper
        RadioButton paper = new RadioButton("Write it on paper");
        paper.setFont(new Font(14));
        paper.setTextFill(Color.RED);
        paper.setOnAction(event -> {
            password.copyToPaper();
        });
        //ToggleGroup
        ToggleGroup buttons = new ToggleGroup();
        copyPaste.setToggleGroup(buttons);
        paper.setToggleGroup(buttons);
        
        VBox radioOptionsVBox = new VBox(10,radioPrompt,copyPaste,paper);
        radioOptionsVBox.setAlignment(Pos.CENTER);
        
        //screne box
        VBox vbox = new VBox(10,topHeaderHBox,phraseHBox,lengthHBox, buttonImages, scoreHBox, outputHBox,generateButtonHBox,generatedPasswordHBox,headerHBox,radioOptionsVBox);
        
        Scene scene = new Scene(vbox, 700, 500);
        Stage secondStage = new Stage();
        secondStage.setTitle("Passowrd Game");
        secondStage.setScene(scene);
        secondStage.show();
    }
    public static void createFile()
    {
        try {
            RandomAccessFile phrasesFile = new RandomAccessFile("phrases.dat","rw");
            RandomAccessFile numsFile = new RandomAccessFile("nums.dat","rw");
            RandomAccessFile charsFile = new RandomAccessFile("chars.dat","rw");
            String array[] = new String[15];
            array[0] = "i hate exercising";
            array[1] = "NSA is watching";
            array[2] = "Secure password 4 me";
            array[3] = "I miss my two dogs";
            array[4] = "I miss my two cats";
            array[5] = "Singing in the Rain";
            array[6] = "Singing in the Snow";
            array[7] = "Star Wars is the best movie";
            array[8] = "Star Trek is rhe better";
            array[9] = "Chicken comes before its egg";
            array[10] = "An egg is a fun subject";
            array[11] = "Math is a fun subject";
            array[12] = "I want to be a programmer";
            array[13] = "Protect your online accounts";
            array[14] = "A white barn is prtty";
            for(int i = 0; i < 15; i++)
            {
                phrasesFile.writeInt(array[i].length());
                phrasesFile.writeChars(array[i]);
            }
            for(int i =0; i < 10; i++)
            {
                numsFile.writeInt(i);
            }
            char specialLetters[] = {'!','"','#','$','%','&','(',')','*','+',',','-','.','/',':',';','<','=','>','@','?','[',']','^','_','`','{','}','|','~'};
            out.println(specialLetters.length);
            for(int i=0; i < specialLetters.length;i++ )
            {
                charsFile.writeChar(specialLetters[i]);
            }
            phrasesFile.close();
            numsFile.close();
            charsFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void main(String[] args) 
    {
        launch(args);
    }   

    
}
