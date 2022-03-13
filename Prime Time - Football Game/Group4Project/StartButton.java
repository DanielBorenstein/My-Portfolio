
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends MenuClasses
{
    
        int menuPlay = 0;
        GreenfootSound menuMusic = new GreenfootSound("menuMusic.mp3");
        
    
    
    
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(turnedOn()) {
            menuMusic.pause();
            Greenfoot.setWorld(new MyWorld());
            
            
        }
        turnedOn();
        if(menuPlay == 0) {
         
         menuMusic.playLoop();  
         menuPlay++;
        }
    }  
    public boolean turnedOn() {
        if(Greenfoot.mouseClicked(this)) {
            
            return true;
    }
        return false;
    }
}
