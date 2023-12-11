import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is used as the first ball spawned in heading towards the player for them to interact with.
 * 
 * @author Liam Courtney 
 * @version 2.0
 */
public class Ball extends Actor
{
    private int speed; // Variable for the balls speed
    private boolean leftSpawn; // Booleans to check if the ball is spawned on the left or right
    private boolean rightSpawn;
    
    /**
     * Constructor for objects of class Ball.
     */
    public Ball(int corner) // Gets an argument to indicate if the spawn is right or left
    {
        speed = Greenfoot.getRandomNumber(2) +1; // Sets a random speed for the ball
        
        leftSpawn = corner == 0; // Checks if the spawn is left or right
        rightSpawn = corner == 1; // ^^^
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (leftSpawn) 
        {
            moveTowardsRight();
        }
        if (rightSpawn)
        {
            moveTowardsLeft();
        }
        
        despawn();
    }
    
    public void moveTowardsLeft() // Moves diagonally from the left hand corner
    {
        setLocation(getX() - speed, getY() + speed);
    }
    
    public void moveTowardsRight() // Moves diagonally from the right hand corner
    {
        setLocation(getX() + speed, getY() + speed);
    }
    
    public void despawn() // Checks if the ball has reached either of the sides and removes them
    {
        Pitch world = (Pitch) getWorld();
        Lives lives = world.getLives();
        
        int x = getX();
        int y = getY();
        
        if (x < 10 && y > 10)
        {
            world.removeObject(this);
            lives.loseLives(1);
        }
        if (x > 349 && y > 10)
        {
            world.removeObject(this);
            lives.loseLives(1);
        }
    }
}
