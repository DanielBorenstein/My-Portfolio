import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lines on the field are used to simulate vertical movement of characters.
 * 
 * @author Group 4
 * @version 3/16/21
 */
public class FieldLine extends Actor
{
    
    String fieldLine = "";
    GreenfootImage image = new GreenfootImage("footballfieldresized.png");
    int xPosition;
    int yPosition;
    int startPositionX;
    int startPositionY;
    
    
    
    public FieldLine() {
        
        
       
        setImage(image);
    }
    
    /**
     * Act - do whatever the FieldLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
      moveLine();
      
      
      
      
    } 
    
    /**
     * Reset method deals with resetting objects when advancing levels in the game.
     */
    public void reset() {
        
    }
    public void moveLine() { //moves the lines up and down.
       int xpos = getX();
       int ypos = getY();
       
       // moves the field down
       if (Greenfoot.isKeyDown("w")) {
       setLocation(xpos, ypos + 1);
    }
    
        // moves the field up
     if (Greenfoot.isKeyDown("s")) {
       setLocation(xpos, ypos - 1);
    }
    }
}
