
package project;

public class UserScore implements Players
{
    private int score; //holds the current games score
    
    public UserScore() //default constructor
    {
        score = 0; //sets score to zero
    }

    @Override
    public int getScore() //gets the score value
    {
        return score; 
    }

    @Override
    public void updateScore() //increases the score after a win
    {
       score += 1;
    }
    
}
