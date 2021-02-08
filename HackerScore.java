
package project;

public class HackerScore implements Players
{
    private int score; //holds the hackers score
    public HackerScore() //default constructor
    {
        score = 0; //sets score to zero
    }
    @Override
    public int getScore() //returns the score
    {
        return score; //returns the current games score
    }
    @Override
    public void updateScore() //updates current score after win
    {   
        score +=1;//increases score by 1 after a win
    }
    
}
