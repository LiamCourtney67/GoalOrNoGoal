import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the score counter used to keep track of the score.
 * 
 * @author Liam Courtney 
 * @version 1.0
 */
public class Score extends Actor
{
    private int totalScore = 0; // Variable that holds the players score
    
    /**
     * This is the constructor for the Score class.
     */
    public Score()
    {
        setImage(new GreenfootImage("Score: 0", 20, Color.BLACK, Color.WHITE)); // Sets the image that the score is shown on
    }

    public void addScore(int amount) // Method to add score, by a given amount
    {
        totalScore += amount;
        setImage(new GreenfootImage("Score: " + totalScore, 20, Color.BLACK, Color.WHITE));
    }
}
