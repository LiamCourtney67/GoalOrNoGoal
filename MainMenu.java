import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world that is loaded when the player starts the game or returns from the lose screen.
 * 
 * @author Liam Courtney
 * @version 1.0
 */
public class MainMenu extends World
{
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(359, 477, 1); // This sets the width and height of the world
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("p")) // This takes user input of "p" and loads up the game on the pitch world
        {
            Pitch game = new Pitch();
            Greenfoot.setWorld(game);
        }
    }
}
