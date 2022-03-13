import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lighting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lighting extends Actor
{
    
    
    /**
     * Act - do whatever the Lighting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Lighting() {
        
    }
    public void act() 
    {
        // Add your action code here.
        touchingPlayer();
        
    }
    public boolean touchingPlayer() {
        if (isTouching(BoJackson.class))
        {
           
           return true;
        }
        else {
            return false;
        }
        
    }
}
