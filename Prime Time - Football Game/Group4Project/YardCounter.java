import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YardCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YardCounter extends Actor
{
    /**
     * Act - do whatever the YardCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int yards = 0;
    String yardCount = "";
    public void act() 
    {
       if (Greenfoot.isKeyDown("w")) {
       yards++;
    }
    
        
     if (Greenfoot.isKeyDown("s")) {
       yards--;
    }
    yardCount = "Score: " + yards/30;
    GreenfootImage image = new GreenfootImage(yardCount,50, Color.ORANGE, Color.BLUE);
    setImage(image);
    } 
    public int getScore() {
        return yards/30;
    }
    public void yardMover() {
       if (Greenfoot.isKeyDown("w")) {
           yards++;
    }
    
        
        if (Greenfoot.isKeyDown("s")) {
            yards--;
    } 
    }

}


