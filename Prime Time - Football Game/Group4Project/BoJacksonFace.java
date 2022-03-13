import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoJacksonFace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BoJacksonFace extends Actor
{
    /**
     * Act - do whatever the BoJacksonFace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
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
