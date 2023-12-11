import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Defender here.
 * 
 * @author Liam Courtney 
 * @version 1.1
 */
public class Defender extends Actor
{
    private int direction; // Variable to hold what direction the defender is currently heading
    private int speed; // Variable for the defenders speed
    
    /**
     * Constructor for objects of class Defender.
     */
    public Defender()
    {
        direction = 0; // Sets the direction to left to start off
        speed = 1; // Sets the defenders speed
    }
    
    /**
     * Act - do whatever the Defender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        tackle();
    }
    
    public void move() // Moves the defender from left to right
    {
        if(direction == 0)
        {
            moveLeft();
        }
        else if(direction == 1)
        {
            moveRight();
        }
    }
    
    public void moveLeft() // Moves the defender to the left
    {
        setLocation(getX() - speed, getY());
        
        if(getX() <= 25)
        {
            direction = 1;
        }
    }
    
    public void moveRight() // Moves the defender to the right
    {
        setLocation(getX() + speed, getY());
        
        if(getX() >= 334)
        {
            direction = 0;
        }
    }
    
    public void tackle() // Checks if the defender collides with the player, loses a life and sends the player to the middle
    {
        Actor player = getOneIntersectingObject(Footballer.class);
        Pitch world = (Pitch) getWorld();
        Lives lives = world.getLives();
        
        if (player != null)
        {
            lives.loseLives(1);
            player.setLocation(179, 238);
        }
    }
}
