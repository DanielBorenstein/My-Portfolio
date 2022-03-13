import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class subMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BtnMenu extends MenuClass
{
    MenuClass main;
    String txt = "";
    int value = -1;
    boolean hover;
    
    public BtnMenu(MenuClass mainIn, String txtIn, int valueIn) {
        main = mainIn;
        txt = txtIn;
        value = valueIn;
        refreshImage();
    }
    
    
    
    
    
    
    
    
    
    /**
     * Act - do whatever the subMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (Greenfoot.mouseMoved(null)) {
            if (Greenfoot.mouseMoved(this) && !hover) {
                hover = true;
                refreshImage();
            }
            if (!Greenfoot.mouseMoved(this) && hover) {
                hover = false;
                refreshImage();
                
            }
            
        }
        setLocation(main.getX(), main.getY() + (main.height + 1) * (value + 1));
    }  
    
    public void refreshImage() {
        GreenfootImage a1 = new GreenfootImage(main.width, main.height);
        Color b1Color = hover ? main.hoverColor : main.bkgrndColor;
        a1.setColor(b1Color);
        a1.fill();
        GreenfootImage pic = new GreenfootImage(txt, main.fntSize, main.txtColor, b1Color);
        a1.drawImage(pic, (main.width - pic.getWidth()) / 2, (main.height - pic.getHeight()) / 2);
        a1.setColor(main.frameColor);
        a1.drawRect(0, 0, main.width - 1, main.height - 1);
        setImage(a1);
    }
}
