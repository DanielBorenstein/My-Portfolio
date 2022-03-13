import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends MenuClasses
{
    
    int menuPlay = 0;
    GreenfootSound runningMusic = new GreenfootSound("runningMusic.mp3");
    public BackButton() {
        GreenfootImage bkbutton = getImage();
        bkbutton.scale(bkbutton.getWidth() - 125, bkbutton.getHeight() - 50);
        setImage(bkbutton);
    }
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if(Greenfoot.mouseClicked(this)) {
            runningMusic.pause();
            Greenfoot.setWorld(new Menu());
            
        }
        if(menuPlay == 0) {
         
         runningMusic.playLoop();  
         menuPlay++;
        }
    }    
}
