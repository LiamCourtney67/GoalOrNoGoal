import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is used as the ball that is spawned and heads towards the goal after the player interacts with the first ball.
 * 
 * @author Liam Courtney 
 * @version 1.0
 */
public class KickedBall extends Actor
{
    private int speed; // Variable for the kicked balls speed
    
    /**
     * Constructor for objects of class KickedBall.
     */
    public KickedBall()
    {
        speed = 3; // Sets the speed for each individual object
    }
    
    /**
     * Act - do whatever the KickedBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        kicked();
        despawn();
    }
    
    public void kicked() // Moves the ball towards the top of the screen with a slight turn
    {
        int x = getX();
        int y = getY();
        
        setLocation(x, y - speed);
        turn(-3);
    }
    
    public void despawn() // Checks if the kicked ball has reached the top of the world if so removes it and loses a life (Goal class checks if any reach the goal line first)
    {
        Pitch world = (Pitch) getWorld();
        Lives lives = world.getLives();
        
        int x = getX();
        int y = getY();
        
        if (y == 0)
        {
            world.removeObject(this);
            lives.loseLives(1);
        }
    }
}
