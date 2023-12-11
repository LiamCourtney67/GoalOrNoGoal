import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the goal class used for hit detection on the goal line.
 * 
 * @author Liam Courtney 
 * @version 1.1
 */
public class Goal extends Actor
{
    private int x; // Variables for drawing the goal line 
    private int y;
    private int width;
    private int height;
    private GreenfootImage shapeImage;
    
    /**
     * This is the constructor for the Goal class.
     */
    public Goal()
    {
        x = 0; // Setting the variables for drawing the goal line 
        y = 0;
        width = 60;
        height = 5;
        
        shapeImage = new GreenfootImage(width, height); // Drawing the goal line in white over set dimensions
        shapeImage.setColor(Color.WHITE);
        shapeImage.drawRect(x, y, width-1,height-1);
        shapeImage.fill();
        setImage(shapeImage);
    }
    
    /**
     * Act - do whatever the Goal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        score();
    }
    
    public void score() // Checks if the kicked ball interacts with the goal line and if so removes it and adds 1 to the score
    {
        Actor ball = getOneIntersectingObject(KickedBall.class);
        Pitch world = (Pitch) getWorld();
        Score score = world.getScore();
        
        if (ball != null)
        {
            world.removeObject(ball);
            score.addScore(1);
        }
    }
    
    
}
