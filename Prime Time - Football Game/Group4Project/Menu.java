import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    
    
    //new stuff
    int menuCount = 0;
    int menuTimer = 0;
    int menuSpeed = 5;
    int menuPlay = 0;
    GreenfootSound menuMusic = new GreenfootSound("menuMusic.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1124, 750, 1); 
        MenuClass creditsMenu = new MenuClass("L.I.D.");
        creditsMenu.add("Leo Rincon");
        creditsMenu.add("Isaiah-Dre Burkes");
        creditsMenu.add("Daniel Borenstein");
        addObject(creditsMenu, 556, 20);
        
        StartButton startButton1 = new StartButton();
        addObject(startButton1, 557, 500);
        
        
        
        
        //new stuff
        setBackground(new GreenfootImage("Menu0.jpg"));
        
    }
    
    public void act() {
        
        
        if (menuCount == 21) {
            menuCount = 0;
        }
        switch (menuCount) {
            case 0: 
                setBackground(new GreenfootImage("Menu0.jpg"));   
                break;
            case 1: 
                setBackground(new GreenfootImage("Menu10.jpg"));   
                break;
            case 2: 
                setBackground(new GreenfootImage("Menu20.jpg"));   
                break;
            case 3: 
                setBackground(new GreenfootImage("Menu30.jpg"));   
                break;
            case 4: 
                setBackground(new GreenfootImage("Menu40.jpg"));   
                break;
            case 5: 
                setBackground(new GreenfootImage("Menu50.jpg"));   
                break;
            case 6: 
                setBackground(new GreenfootImage("Menu60.jpg"));   
                break;
            case 7: 
                setBackground(new GreenfootImage("Menu70.jpg"));   
                break;
            case 8: 
                setBackground(new GreenfootImage("Menu80.jpg"));   
                break;
            case 9: 
                setBackground(new GreenfootImage("Menu90.jpg"));   
                break;
            case 10: 
                setBackground(new GreenfootImage("Menu100.jpg"));   
                break;
            case 11: 
                setBackground(new GreenfootImage("Menu90.jpg"));   
                break;
            case 12: 
                setBackground(new GreenfootImage("Menu80.jpg"));   
                break;
            case 13: 
                setBackground(new GreenfootImage("Menu70.jpg"));   
                break;
            case 14: 
                setBackground(new GreenfootImage("Menu60.jpg"));   
                break;
            case 15: 
                setBackground(new GreenfootImage("Menu50.jpg"));   
                break;
            case 16: 
                setBackground(new GreenfootImage("Menu40.jpg"));   
                break;
            case 17: 
                setBackground(new GreenfootImage("Menu30.jpg"));   
                break;
            case 18: 
                setBackground(new GreenfootImage("Menu20.jpg"));   
                break;
            case 19: 
                setBackground(new GreenfootImage("Menu10.jpg"));   
                break;    
            case 20: 
                setBackground(new GreenfootImage("Menu0.jpg"));
                
                break;  
            
        }
        
        if(menuTimer % menuSpeed == 0) {
            menuCount++;
        }
        menuTimer++;
        
    }
}
