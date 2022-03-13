

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BoJackson here.
 * 
 * @Daniel Borenstein
 * @version 3/20/21
 */
public class BoJackson extends Actor
{
    GreenfootImage nbfs = new GreenfootImage("noballforwardstill.png");
    GreenfootImage nbfr1 = new GreenfootImage("noballforwardrun1.png");
    GreenfootImage nbfr2 = new GreenfootImage("noballforwardrun2.png");
    GreenfootImage nbrr1 = new GreenfootImage("noballrightrun1.png");
    GreenfootImage nbrr2 = new GreenfootImage("noballrightrun2.png");
    GreenfootImage nblr1 = new GreenfootImage("noballleftrun1.png");
    GreenfootImage nblr2 = new GreenfootImage("noballleftrun2.png");
    GreenfootImage nedr1 = new GreenfootImage("nediagonalrun1.png");
    GreenfootImage nedr2 = new GreenfootImage("nediagonalrun2.png");
    GreenfootImage nwdr1 = new GreenfootImage("nwdiagonalrun1.png");
    GreenfootImage nwdr2 = new GreenfootImage("nwdiagonalrun2.png");
    GreenfootImage swdr1 = new GreenfootImage("swdiagonalrun1.png");
    GreenfootImage swdr2 = new GreenfootImage("swdiagonalrun2.png");
    GreenfootImage sedr1 = new GreenfootImage("sediagonalrun1.png");
    GreenfootImage sedr2 = new GreenfootImage("sediagonalrun2.png");
    GreenfootImage nbbr1 = new GreenfootImage("noballbackwardrun1.png");
    GreenfootImage nbbr2 = new GreenfootImage("noballbackwardrun2.png");
    GreenfootImage nbbs = new GreenfootImage("noballbackwardstill.png");
    GreenfootImage nbrs = new GreenfootImage("noballrightstill.png");
    GreenfootImage nbls = new GreenfootImage("noballleftstill.png");
    int count = 0;
    int stance = 1;
    public BoJackson() {
        
        
        setImage(nbfs);
    }
    /**
     * Act - do whatever the BoJackson wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a")) {
            nwStance();
            stance = 1;
        }
        else if (Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("A")) {
            nwStance();
            stance = 1;
        }
        else if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d")) {
            neStance();
            stance = 1;
        }
        else if (Greenfoot.isKeyDown("W") && Greenfoot.isKeyDown("D")) {
            neStance();
            stance = 1;
        }
        else if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a")) {
            swStance();
            stance = 2;
        }
        else if (Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("A")) {
            swStance();
            stance = 2;
        }
        else if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d")) {
            seStance();
            stance = 2;
        }
        else if (Greenfoot.isKeyDown("S") && Greenfoot.isKeyDown("D")) {
            seStance();
            stance = 2;
        }
        else if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("W")) {
            runningForwardStance();
            stance = 1;
        }
        else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("D")) {
            runningRightStance();
            stance = 3;
        }
        else if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("A")) {
            runningLeftStance();
            stance = 4;
        }
        else if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("S")) {
            runningBackStance();
            stance = 2;
        }
        else{
        
            if (stance == 1) {
                forwardStance();
            }
            if (stance == 3) {
                rightStance();
            }
            if (stance == 4) {
                leftStance();
            }
            if (stance == 2) {     
                backStance();
            }
        }
        
        //f-1 b-2 r-3 L-4
     
        
        
        
        
        
    
    }
     
    
    public void forwardStance() {
        setImage(nbfs);
    }
    public void rightStance() {
        setImage(nbrs);
    }
    public void leftStance() {
        setImage(nbls);
    }
    public void backStance() {
        setImage(nbbs);
    }
    public void runningForwardStance() {
        
        
        if (count <= 10) {
            setImage(nbfr1);
            count++;
            
        }
        else if (count > 10 && count < 20) {
            setImage(nbfr2);
            count++;
        }
        else {
            count = 0;
        }
    }
    public void runningLeftStance() {
        int y = getY();
        int x = getX();
        setLocation(x - 1, y);
        if (count <= 10) {
            setImage(nblr1);
            count++;
        }
        else if (count > 10 && count < 20) {
            setImage(nblr2);
            count++;
        }
        else {
            count = 0;
        } 
    }
    public void runningRightStance() {
        int y = getY();
        int x = getX();
        setLocation(x + 1, y);
        if (count <= 10) {
            setImage(nbrr1);
            count++;
        }
        else if (count > 10 && count < 20) {
            setImage(nbrr2);
            count++;
        }
        else {
            count = 0;
        } 
    }
    public void runningBackStance() {
      if (count <= 10) {
            setImage(nbbr1);
            count++;
            
        }
        else if (count > 10 && count < 20) {
            setImage(nbbr2);
            count++;
        }
        else {
            count = 0;
        }  
    }
    public void neStance() {
      {
        int y = getY();
        int x = getX();
        setLocation(x + 1, y);
        if (count <= 10) {
            setImage(nedr1);
            count++;
        }
        else if (count > 10 && count < 20) {
            setImage(nedr2);
            count++;
        }
        else {
            count = 0;
        } 
    }  
    }
    public void nwStance() {
     int y = getY();
     int x = getX();
     setLocation(x - 1, y);
     if (count <= 10) {
         setImage(nwdr1);
         count++;
        }
        else if (count > 10 && count < 20) {
            setImage(nwdr2);
            count++;
        }
        else {
            count = 0;   
    }
}
    public void seStance() {
      {
        int y = getY();
        int x = getX();
        setLocation(x + 1, y);
        if (count <= 10) {
            setImage(sedr1);
            count++;
        }
        else if (count > 10 && count < 20) {
            setImage(sedr2);
            count++;
        }
        else {
            count = 0;
        } 
    }  
    }
    public void swStance() {
       {
     int y = getY();
     int x = getX();
     setLocation(x - 1, y);
     if (count <= 10) {
         setImage(swdr1);
         count++;
        }
        else if (count > 10 && count < 20) {
            setImage(swdr2);
            count++;
        }
        else {
            count = 0;   
    }
} 
    }
}
