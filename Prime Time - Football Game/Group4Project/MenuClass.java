import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuClass extends Actor
{
    String[] btns = new String[15];
    BtnMenu[] btnMenu = {  };
    
    int btnCount;
    int width;
    int height;
    int fntSize = 30;
    
    String returnValue = "";
    String mainText = "";
    
    boolean running;
    boolean mouseHovering;
    
    // maybe change this?
    Color bkgrndColor = Color.BLUE;
    Color txtColor = Color.ORANGE;
    Color frameColor = Color.WHITE;
    Color hoverColor = Color.CYAN;
    
    
    public MenuClass() {
    }
    
    public MenuClass(String mainTextIn) {
        mainText = mainTextIn;
        GreenfootImage clk = new GreenfootImage(" " + mainText + " ", fntSize, txtColor, bkgrndColor);
        width = clk.getWidth();
        height = clk.getHeight();
        clk.drawRect(0, 0, width -1, height -1);
        setImage(clk);
        
    }
    
    
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            
            if(!running) {
                turnOn();
            }
            else{
                turnOff();
            }
        }
        if (Greenfoot.mouseMoved(null)) 
        {
            if (Greenfoot.mouseMoved(this) && !mouseHovering)
            {
             mouseHovering = true;
             refreshImage();
            }
            if (!Greenfoot.mouseMoved(this) && mouseHovering)
            {
                mouseHovering = false;
                refreshImage();
            }
        }
    } 
    
    
    private void turnOn()
    {
        btnMenu = new BtnMenu[btnCount];
        for (int i = 0; i < btnCount; i++)
        {
            btnMenu[i] = new BtnMenu(this, btns[i], i);
            getWorld().addObject(btnMenu[i], getX(), getY() + (fntSize + 1) * (i + 1));
        }
        running = true;
    }
    private void turnOff() {
        for (int i = 0; i < btnCount; i++) {
            getWorld().removeObject(btnMenu[i]);
        }
        running = false;
        
    }
    public void add(String txt) {
        
        btns[btnCount++] = txt;
        GreenfootImage clk = new GreenfootImage(" " + txt + " ", fntSize, Color.ORANGE, Color.BLUE);
        width = clk.getWidth() > width ? clk.getWidth() : width;
        height = clk.getHeight() > height ? clk.getHeight() : height;
    }
    
    
    
    
    private void refreshImage() {
        Color a1Color = (mouseHovering) ? hoverColor : bkgrndColor;
                                        // maybe get rid ^^^
        GreenfootImage clk = new GreenfootImage(" " + mainText + " ", fntSize, txtColor, a1Color);
        clk.setColor(frameColor);
        clk.drawRect(0, 0, clk.getWidth() -1, clk.getHeight() - 1);
        setImage(clk);
        if (running) {
            for (int i = 0; i < btnCount; i++) {
                btnMenu[i].refreshImage();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
}
