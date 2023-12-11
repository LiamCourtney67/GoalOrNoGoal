import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is controlled by the player and used to interact with other objects.
 * 
 * @author Liam Courtney 
 * @version 2.0
 */
public class Footballer extends Actor
{
    private int speed; // Variable for the players speed
    private int movementAnimationIndex = 0; // Variables for animation
    private int numberOfMovementFrames = 3; // ^^^
    GreenfootImage[] characterAnimation = new GreenfootImage[3]; // This array stores the animation frames
    
    /**
     * Constructor for objects of class Footballer.
     */
    public Footballer()
    {
        speed = 2; // Sets the players speed
        
        for(int i = 0; i < numberOfMovementFrames; i++) // Loads movement frames into the animation
        {
            characterAnimation[i] = new GreenfootImage("kick"+i+".png");            
        }
    }
    
    /**
     * Act - do whatever the Footballer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        kick();
    }

    public void move() // Control the players movement with "wasd"
    {
        int x = getX();
        int y = getY();
        
        if(Greenfoot.isKeyDown("w"))
        {
            y -= speed;
            setLocation (x,y);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            y += speed;
            setLocation (x,y);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            x -= speed;
            setLocation (x,y);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            x += speed;
            setLocation (x,y);
        }
    }
    
    public void kick()     {
        Actor ball = getOneObjectAtOffset(0, 15, Ball.class);
        World world = getWorld();
        KickedBall newBall = new KickedBall();
        
        if (Greenfoot.isKeyDown("space")) // Gets user input of "space" and runs the animation
        {
            swapImageMovement();
        }
        
        if (ball != null && Greenfoot.isKeyDown("space")) // Gets user input of "space", checks if the player interacts with the ball and removes the ball and spawns a KickedBall

        {
            world.removeObject(ball);
            world.addObject(newBall, getX()+15, getY()+30);
        }
    }
    
    public void swapImageMovement() // Runs the animation of the player kicking
    {        
        setImage(characterAnimation[movementAnimationIndex]);
        movementAnimationIndex++;
        
        if(movementAnimationIndex == numberOfMovementFrames)// If we have cycled through all of the images reset the counter back to 0
        {
            movementAnimationIndex = 0;        
        }
    }
}
