import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world that is loaded when the player starts the game from the main menu screen.
 * 
 * @author Liam Courtney 
 * @version 2.0
 */
public class Pitch extends World
{
    private Footballer player = new Footballer(); // Creating all the individual objects for the player to interact with
    private Defender defender = new Defender();
    private Goal goal = new Goal();
    private Score score = new Score();
    private Lives lives = new Lives();
    private Name userName = new Name();
    
    /**
     * Constructor for objects of class Pitch.
     * 
     */
    public Pitch()
    {    
        super(359, 477, 1); // Creating the world 
        userName.setName(Greenfoot.ask("Please enter your name.")); // Getting user input for the player's name 
        
        addObject(player, 179, 238); // Adding the objects to the game in certain positions
        addObject(defender, 179, 100);
        addObject(goal, 179, 15);
        addObject(userName, 50, 220);
        addObject(score, 50 ,240);
        addObject(lives, 50 ,260);       
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(250) < 1) // This controls when a ball can spawn with a 1 in 250 chance
        {
            int spawnSide = Greenfoot.getRandomNumber(2); // Picks a random side for the ball to spawn at, 0 being left and 1 being right
        
            if (spawnSide == 0) 
            {
                addObject(new Ball(0), 0, 0); // Spawns a ball from the left hand corner
            }
            else if (spawnSide == 1)
            {
                addObject(new Ball(1), 359, 0); // Spawns a ball from the right hand corner
            }
        }
    }
    
    public Score getScore() // Method for other classes to access the current score
    {
        return score;
    }
    
    public Lives getLives() // Method for other classes to access the current lives
    {
        return lives;
    }
   }
