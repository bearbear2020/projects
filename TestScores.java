
package ch10;

import java.io.Serializable;
import static java.lang.System.out;

public class TestScores implements Serializable
{
    private double scores[]; //stores the scores array
    
    public TestScores(double scores[])//constructor
    {
        this.scores = scores;
    }
    public void setScores(double scores[])//update scores array
    {
        this.scores = scores;
    }
    public double getAvg()//get average
    {
        double avg = 0;
        
            for(int i =0; i < scores.length; i++)
            {
                if(scores[i] < 0 || scores[i] > 100)//sends an error message if the score is out of range
                    throw new IllegalArgumentException("Not a valid range");
                avg += scores[i];//adds all the scores together
            }
            avg /= scores.length;//calcs the avg
         
        return avg;//returns the average
    }
    @Override
   public String toString()//ovderride of the toString method
   {
       String output ="Array stored values\n";
       for(int i =0; i < scores.length; i++)
       {
           output += scores[i] + " ";
       }
       return output + "\n";
   }
}
