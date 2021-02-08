
package ch.pkg9.pkg5;
import static java.lang.System.*;
public class CourseGrades implements Analyzable
{
    private GradedActivity grades[]; //array of GradedActivities
    
    public CourseGrades() //defaul constructor 
    {
        
        grades = new GradedActivity[4]; //lab
        
    }
    public void setLab(GradedActivity obj)//sets lab
    {
        
        grades[0] = obj;
        
    }

    public void setPassFailExam(PassFailExam obj)//sets pass or fail
    {
        grades[1] = obj;
    }
      public void setEssay(GradedActivity obj) //sets essay
    {
        grades[2] = obj;
    }

    public void setFinalExam(FinalExam obj) //sets final exam
    {
        grades[3] = obj;
    }
     @Override
     public double getAverage()
     {
         double avg =0;
         for(int i =0; i < 4; i++)
             avg += grades[i].getScore();
         avg /=4; //4 grades
         return avg;
         
     }
     @Override
    public GradedActivity getHighest()
    {
        GradedActivity highest = grades[0];
         for(int i =1; i < 4; i++)
         {
             if(grades[i].getScore() > highest.getScore())
             {
                highest = grades[i];
             }
         }
         return highest;
    }
    @Override
    public GradedActivity getLowest()
    {
        GradedActivity lowest = grades[0];
         for(int i =1; i < 4; i++)
         {
             if(grades[i].getScore() < lowest.getScore())
             {
                lowest = grades[i];
             }
         }
         return lowest;
    }
    @Override
    public String toString() //returns the final grade
    {
        return  "Lab Score: " + grades[0].getScore() + " letter grade: " + grades[0].getGrade() +
        "\nPass/Fall Exam: " + grades[1].getScore() + " letter grade: " + grades[1].getGrade()+ 
        "\nEssay: "  + grades[2].getScore() + " letter grade: " + grades[2].getGrade()+
        "\nFinal Exam: " + grades[3].getScore() + " letter grade: " + grades[3].getGrade() + 
        "\nAvg Score: " + getAverage() +
        "\nHighest: " + getHighest().getScore() +
        "\nLowest: " + getLowest().getScore();
        
    }
}
