import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the lives counter used to keep track of the lives.
 * 
 * @author Liam Courtney 
 * @version 1.0
 */
public class Lives extends Actor
{
    private int totalLives = 9; // Variable that holds the amount of lives
    
    /**
     * This is the constructor for the Lives class.
     */
    public Lives()
    {
        setImage(new GreenfootImage("Lives: 9", 20, Color.BLACK, Color.WHITE)); // Creates the image the lives are displayed on
    }

    public void act()
    {
        if (totalLives == 0) // Checks if all lives are lost and if so loses the game
        {
            LoseScreen lose = new LoseScreen();
            Greenfoot.setWorld(lose);
        }
    }
    
    public void loseLives(int amount) // Method to lose a life, by a given amount

    {
        totalLives -= amount;
        setImage(new GreenfootImage("Lives: " + totalLives, 20, Color.BLACK, Color.WHITE));
    }
}
