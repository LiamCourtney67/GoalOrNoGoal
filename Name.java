import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the name class used to retrieve the user input for the player name.
 * 
 * @author Liam Courtney 
 * @version 1.0
 */
public class Name extends Actor
{
    private String userName; // Variable holding the player name
    
    /**
     * Constructor for objects of class Name.
     */
    public Name()
    {
        setImage(new GreenfootImage("Name:", 20, Color.BLACK, Color.WHITE)); // Sets the image that the name is shown on
    }
    
    /**
     * Act - do whatever the Name wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void setName(String userName) // Method that takes an argument for the players name and adds it to the name image
    {
        setImage(new GreenfootImage("Name: " + userName, 20, Color.BLACK, Color.WHITE));
    }
}
