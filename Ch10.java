
package ch10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import static java.lang.System.out;
/*

   Programmer: Trent Giever
   Assignment Chapter: 10
   Purpose: Show Error Handling with serialization and files
   Date modified: 1/5/2021
   IDE/Tool used: NetBeans 8.2

   */
public class Ch10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        TestScores[] myScores = new TestScores[5];// array of TestScores
        double[] array = new double[5];//array for the scores
        array[0] = 70;
        array[1] = 75;
        array[2] = 80;
        array[3] = 85;
        array[4] = 90;
        for(int i = 0; i < myScores.length;i++)
        {
        array[0] = i + 90;    
        TestScores obj = new TestScores(array);//first obj
        myScores[i] = obj;
        out.println(myScores[i].getAvg());
        out.println(myScores[i]);
        }
        
        FileOutputStream outStream = new FileOutputStream("data.dat");
        ObjectOutputStream output = new ObjectOutputStream(outStream);
        
        for(int i = 0; i < myScores.length;i++)
        {
            output.writeObject(myScores[i]);
        }
        output.close();
       
        
    }
    
}
