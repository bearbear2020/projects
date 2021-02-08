package ch10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.Serializable;
import static java.lang.System.out;
/*

   Programmer: Trent Giever
   Assignment Chapter: 10
   Purpose: Show Error Handling with serialization and files
   Date modified: 1/5/2021
   IDE/Tool used: NetBeans 8.2

   */
public class ch109 {

    
    public static void main(String[] args) throws Exception
    {
        TestScores[] myScores = new TestScores[5];// array of TestScores

        FileInputStream inStream = new FileInputStream("data.dat"); //read data back in
        ObjectInputStream input = new ObjectInputStream(inStream);
        
        for(int i = 0; i < 5;i++) //for look to read in values
        {
            myScores[i] = (TestScores) input.readObject();
        }
        input.close();//close the file
       
        for(int i = 0; i < myScores.length;i++)//pulls the data back
        {
        out.println(myScores[i].getAvg());
        out.println(myScores[i]);
        }
        
        
    }
    
}
