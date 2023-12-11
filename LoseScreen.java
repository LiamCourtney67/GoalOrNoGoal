import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world that is loaded when the player runs out of lives.
 * 
 * @author Liam Courtney 
 * @version 1.0
 */
public class LoseScreen extends World
{
    /**
     * Constructor for objects of class LoseScreen.
     * 
     */
    public LoseScreen()
    {    
        super(359, 477, 1); // This sets the width and height of the world
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("r")) // This takes user input of "r" and changes the world back to the main menu
        {
            MainMenu game = new MainMenu();
            Greenfoot.setWorld(game);
        }
    }
}
