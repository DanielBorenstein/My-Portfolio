
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

/**
 * Write a description of class Defender here.
 * 
 * Isaiah Burkes
 * @version (a version number or a date)
 */
public class Defender extends Actor
{
    private GreenfootImage back1 = new GreenfootImage("back1.png");
    private GreenfootImage back2 = new GreenfootImage("back2.png");
    private GreenfootImage right1 = new GreenfootImage("right1.png");
    private GreenfootImage right2 = new GreenfootImage("right2.png");
    private GreenfootImage left1 = new GreenfootImage("left1.png");
    private GreenfootImage left2 = new GreenfootImage("left2.png");
    private GreenfootImage forward1 = new GreenfootImage("forward1.png");
    private GreenfootImage forward2 = new GreenfootImage("forward2.png");
    private GreenfootImage backtackle1 = new GreenfootImage("backtackle1.png");
    private GreenfootImage backtackle2 = new GreenfootImage("backtackle2.png");
    private GreenfootImage backtackle3 = new GreenfootImage("backtackle3.png");
    private GreenfootImage backtackle4 = new GreenfootImage("backtackle4.png");
    private GreenfootImage backtackle5 = new GreenfootImage("backtackle5.png");
    private GreenfootImage backtackle6 = new GreenfootImage("backtackle6.png");
    private GreenfootImage backtackle7 = new GreenfootImage("backtackle7.png");
    private GreenfootImage righttackle1 = new GreenfootImage("righttackle1.png");
    private GreenfootImage righttackle2 = new GreenfootImage("righttackle2.png");
    private GreenfootImage righttackle3 = new GreenfootImage("righttackle3.png");
    private GreenfootImage righttackle4 = new GreenfootImage("righttackle4.png");
    private GreenfootImage righttackle5 = new GreenfootImage("righttackle5.png");
    private GreenfootImage righttackle6 = new GreenfootImage("righttackle6.png");
    private GreenfootImage righttackle7 = new GreenfootImage("righttackle7.png");
    private GreenfootImage lefttackle1 = new GreenfootImage("lefttackle1.png");
    private GreenfootImage lefttackle2 = new GreenfootImage("lefttackle2.png"); 
    private GreenfootImage lefttackle3 = new GreenfootImage("lefttackle3.png");
    private GreenfootImage lefttackle4 = new GreenfootImage("lefttackle4.png"); 
    private GreenfootImage lefttackle5 = new GreenfootImage("lefttackle5.png");
    private GreenfootImage lefttackle6 = new GreenfootImage("lefttackle6.png");
    private GreenfootImage lefttackle7 = new GreenfootImage("lefttackle7.png");
    private GreenfootImage forwardtackle1 = new GreenfootImage("forwardtackle1.png");
    private GreenfootImage forwardtackle2 = new GreenfootImage("forwardtackle2.png"); 
    private GreenfootImage forwardtackle3 = new GreenfootImage("forwardtackle3.png");
    private GreenfootImage forwardtackle4 = new GreenfootImage("forwardtackle4.png"); 
    private GreenfootImage forwardtackle5 = new GreenfootImage("forwardtackle5.png");
    private GreenfootImage forwardtackle6 = new GreenfootImage("forwardtackle6.png");
    private GreenfootImage forwardtackle7 = new GreenfootImage("forwardtackle7.png");
    
    
    private int level;
    private int movementCount;
    private int directionCount;
    private boolean running;
    private int range = 50;
    private ArrayList<GreenfootImage> backTackleAnimation = new ArrayList<GreenfootImage>();
    private ArrayList<GreenfootImage> forwardTackleAnimation = new ArrayList<GreenfootImage>();
    private ArrayList<GreenfootImage> rightTackleAnimation = new ArrayList<GreenfootImage>();
    private ArrayList<GreenfootImage> leftTackleAnimation = new ArrayList<GreenfootImage>();
    int imageIndex = 0;
    int imageTimer = 0;
    boolean tacklingRight;
    boolean tacklingLeft;
    boolean tacklingBack;
    boolean tacklingForward;
    
   
    public Defender(int level) {
     scaleImages(.65);
     setImage(back1); 
     this.level = level;
     fillBackTackleAnimation();
     fillForwardTackleAnimation();
     fillLeftTackleAnimation();
     fillRightTackleAnimation();
     running = true;
    }
    
    /**
     * Act - do whatever the Defender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
        int yPos = getY();
        
        
        
        
        
        if(running) {
            //Deals with defender movement while player is moving forward
            //or backwards
            
             if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("W")) {
         setLocation(getX(), yPos + 1);
        } else if (Greenfoot.isKeyDown("S") || Greenfoot.isKeyDown("s")) {
            //setLocation(getX(), yPos - 1);
        }
        
        
        
              switch(level) {
           case 1:
           if(tacklingRight) {
               tackleRight();
            } else if(tacklingLeft) {
                tackleLeft();
            } else if (tacklingBack) {
                tackleBack();
            } else if (tacklingForward) {
                tackleForward();
            } else {
                runPatternLevel1();
            }  
           break;
           case 2:
           if(tacklingRight) {
               tackleRight();
            } else if(tacklingLeft) {
                tackleLeft();
            } else if (tacklingBack) {
                tackleBack();
            } else if (tacklingForward) {
                tackleForward();
            } else {
                runPatternLevel2();
            }
           break;
           case 3:
           if(tacklingRight) {
               tackleRight();
            } else if(tacklingLeft) {
                tackleLeft();
            } else if (tacklingBack) {
                tackleBack();
            } else if (tacklingForward) {
                tackleForward();
            } else {
                runPatternLevel3();
            }
           break;
           case 4:
           if(tacklingRight) {
               tackleRight();
            } else if(tacklingLeft) {
                tackleLeft();
            } else if (tacklingBack) {
                tackleBack();
            } else if (tacklingForward) {
                tackleForward();
            } else {
                runPatternLevel4();
            }
           break;
           case 5:
           if(tacklingRight) {
               tackleRight();
            } else if(tacklingLeft) {
                tackleLeft();
            } else if (tacklingBack) {
                tackleBack();
            } else if (tacklingForward) {
                tackleForward();
            } else {
                runPatternLevel5();
            }
           break;
           default:
           
           
        } 
        }else {
         this.getWorld().removeObject(this);   
        }
       
           
            
        
      
    }
    /**
     * Runs West
     */
    public void runLeft() {
        int y = getY();
        int x = getX();
        setLocation(x - 1, y);
        if (movementCount <= 10) {
            setImage(left1);
            movementCount++;
        }
        else if (movementCount > 10 && movementCount < 20) {
            setImage(left2);
            movementCount++;
        }
        else {
            movementCount = 0;
        } 
    }
    /**
     * Runs East
     */
    public void runRight() {
        int y = getY();
        int x = getX();
        setLocation(x + 1, y);
        if (movementCount <= 10) {
            setImage(right1);
           movementCount++;
        }
        else if (movementCount > 10 && movementCount < 20) {
            setImage(right2);
           movementCount++;
        }
        else {
           movementCount = 0;
        } 
    }
    
    /**
     * Runs in the South Direction
     *
     */
    public void runBack() {
         int y = getY();
        int x = getX();
        setLocation(x, y+1);
        if (movementCount <= 10) {
            setImage(back1);
           movementCount++;
        }
        else if (movementCount > 10 && movementCount < 20) {
            setImage(back2);
            movementCount++;
        }
        else {
            movementCount = 0;
        } 
    }
    /**
     * Runs in the North Direction
     */
    public void runForward() {
        int y = getY();
        int x = getX();
        setLocation(x, y-1);
         if (movementCount <= 10) {
            setImage(forward1);
            movementCount++;
            
        }
        else if (movementCount > 10 && movementCount < 20) {
            setImage(forward2);
           movementCount++;
        }
        else {
            movementCount = 0;
        }
    }
    
    
    public void runNE() {
        
    }
    
    public void runNW() {
        
    }
    
    public void runSE() {
        
    }
    
    public void runSW() {
        
        
    }
    
    public void tackleLeft(){
       
    }
    
    public void tackleRight(){
     
     
            if(imageTimer%5 == 0 && imageIndex < 7) {
              setImage(rightTackleAnimation.get(imageIndex));
              setLocation(getX() + 10, getY());
              imageTimer++;
              imageIndex++;
            } else {
               imageTimer++; 
            }
        
        //Tackle animation is finished
        if(imageIndex == 6) {
         Greenfoot.stop();   
        }
    }
    
    public void tackleForward(){
       
    }
    
    public void tackleBack(){
        
            if(imageTimer%5 == 0 && imageIndex < 7) {
              setImage(backTackleAnimation.get(imageIndex));
              imageTimer++;
              imageIndex++;
            } else {
               imageTimer++; 
            }
        
        //Tackle animation is finished
        if(imageIndex == 6) {
         Greenfoot.stop();   
        }    
    }
    
    public void standStill() {
        
    }
    
    public void runPatternLevel1(){
        //Within range to tackle in any direction
        if(inRangeToTackleLeft()) {
            tacklingLeft = true;
          
        } else if(inRangeToTackleRight()) {
            
            tacklingRight = true;
          
        } else if(inRangeToTackleBack()) {
            tacklingBack = true;
            
        } else if(inRangeToTackleForward()) {
            tacklingForward = true;
            
        }
           //Run pattern
            runBack();
        
            }
    
    public void runPatternLevel2(){
    //Within range to tackle in any direction
        if(inRangeToTackleLeft()) {
            tacklingLeft = true;
          
        } else if(inRangeToTackleRight()) {
            
            tacklingRight = true;
          
        } else if(inRangeToTackleBack()) {
            tacklingBack = true;
            
        } else if(inRangeToTackleForward()) {
            tacklingForward = true;
            
        }
        
        //Run pattern
        if(directionCount < 100) {
            runLeft(); 
            directionCount++;
        } else if(directionCount >= 100 && directionCount < 200) {
           runBack();
           directionCount++;
        } else if(directionCount >= 200 && directionCount < 300) {
            runRight();
            directionCount++;

        } else if(directionCount >= 300 && directionCount < 400) {
           runBack();
           directionCount++;   
        } else {
            directionCount = 0;
        }
    }
    
    public void runPatternLevel3(){
       //Within range to tackle in any direction
        if(inRangeToTackleLeft()) {
            tacklingLeft = true;
          
        } else if(inRangeToTackleRight()) {
            
            tacklingRight = true;
          
        } else if(inRangeToTackleBack()) {
            tacklingBack = true;
            
        } else if(inRangeToTackleForward()) {
            tacklingForward = true;
            
        }
        
        //Run pattern
    }
    
    public void runPatternLevel4() {
        //Within range to tackle in any direction
        if(inRangeToTackleLeft()) {
            tacklingLeft = true;
          
        } else if(inRangeToTackleRight()) {
            
            tacklingRight = true;
          
        } else if(inRangeToTackleBack()) {
            tacklingBack = true;
            
        } else if(inRangeToTackleForward()) {
            tacklingForward = true;
            
        }
        
        //Run pattern
        
    }
    
    public void runPatternLevel5() {
       //Within range to tackle in any direction
        if(inRangeToTackleLeft()) {
            tacklingLeft = true;
          
        } else if(inRangeToTackleRight()) {
            
            tacklingRight = true;
          
        } else if(inRangeToTackleBack()) {
            tacklingBack = true;
            
        } else if(inRangeToTackleForward()) {
            tacklingForward = true;
            
        }
        
        //Run pattern
    }
    

    public void fillBackTackleAnimation() {
        backTackleAnimation.add(backtackle1);
        backTackleAnimation.add(backtackle2);
        backTackleAnimation.add(backtackle3);
        backTackleAnimation.add(backtackle4);
        backTackleAnimation.add(backtackle5);
        backTackleAnimation.add(backtackle6);
        backTackleAnimation.add(backtackle7);
    }
    
    public void fillForwardTackleAnimation(){
        forwardTackleAnimation.add(forwardtackle1);
        forwardTackleAnimation.add(forwardtackle2);
        forwardTackleAnimation.add(forwardtackle3);
        forwardTackleAnimation.add(forwardtackle4);
        forwardTackleAnimation.add(forwardtackle5);
        forwardTackleAnimation.add(forwardtackle6);
        forwardTackleAnimation.add(forwardtackle7);   
    }
    
    public void fillLeftTackleAnimation(){
        leftTackleAnimation.add(lefttackle1);
        leftTackleAnimation.add(lefttackle2);
        leftTackleAnimation.add(lefttackle3);
        leftTackleAnimation.add(lefttackle4);
        leftTackleAnimation.add(lefttackle5);
        leftTackleAnimation.add(lefttackle6);
        leftTackleAnimation.add(lefttackle7);
        
    }
    
    public void fillRightTackleAnimation(){
         rightTackleAnimation.add(righttackle1);
         rightTackleAnimation.add(righttackle2);
         rightTackleAnimation.add(righttackle3);
         rightTackleAnimation.add(righttackle4);
         rightTackleAnimation.add(righttackle5);
         rightTackleAnimation.add(righttackle6);
         rightTackleAnimation.add(righttackle7);
           
    }
    
   
    
    public void scaleImages(double scale) {
       
            back1.scale((int)(back1.getWidth() * scale), (int)(back1.getHeight() * scale));
            back2.scale((int)(back2.getWidth() * scale), (int)(back2.getHeight() * scale));
            left1.scale((int)(left1.getWidth() * scale), (int)(left1.getHeight() * scale));
            left2.scale((int)(left2.getWidth() * scale), (int)(left2.getHeight() * scale));            
            right1.scale((int)(right1.getWidth() * scale), (int)(right1.getHeight() * scale));
            right2.scale((int)(right2.getWidth() * scale), (int)(right2.getHeight() * scale));
            forward1.scale((int)(forward1.getWidth() * scale), (int)(forward1.getHeight() * scale));
            forward2.scale((int)(forward2.getWidth() * scale), (int)(forward2.getHeight() * scale));          
            backtackle1.scale((int)(backtackle1.getWidth() * scale), (int)(backtackle1.getHeight() * scale));
            backtackle2.scale((int)(backtackle2.getWidth() * scale), (int)(backtackle2.getHeight() * scale));           
            backtackle3.scale((int)(backtackle3.getWidth() * scale), (int)(backtackle3.getHeight() * scale));
            backtackle4.scale((int)(backtackle4.getWidth() * scale), (int)(backtackle4.getHeight() * scale));   
            backtackle5.scale((int)(backtackle5.getWidth() * scale), (int)(backtackle5.getHeight() * scale));
            backtackle6.scale((int)(backtackle6.getWidth() * scale), (int)(backtackle6.getHeight() * scale)); 
            backtackle7.scale((int)(backtackle7.getWidth() * scale), (int)(backtackle7.getHeight() * scale));
            forwardtackle1.scale((int)(forwardtackle1.getWidth() * scale), (int)(forwardtackle1.getHeight() * scale));
            forwardtackle2.scale((int)(forwardtackle2.getWidth() * scale), (int)(forwardtackle2.getHeight() * scale));           
            forwardtackle3.scale((int)(forwardtackle3.getWidth() * scale), (int)(forwardtackle3.getHeight() * scale));
            forwardtackle4.scale((int)(forwardtackle4.getWidth() * scale), (int)(forwardtackle4.getHeight() * scale));   
            forwardtackle5.scale((int)(forwardtackle5.getWidth() * scale), (int)(forwardtackle5.getHeight() * scale));
            forwardtackle6.scale((int)(forwardtackle6.getWidth() * scale), (int)(forwardtackle6.getHeight() * scale)); 
            forwardtackle7.scale((int)(forwardtackle7.getWidth() * scale), (int)(forwardtackle7.getHeight() * scale));
            lefttackle1.scale((int)(lefttackle1.getWidth() * scale), (int)(lefttackle1.getHeight() * scale));
            lefttackle2.scale((int)(lefttackle2.getWidth() * scale), (int)(lefttackle2.getHeight() * scale));
            lefttackle3.scale((int)(lefttackle3.getWidth() * scale), (int)(lefttackle3.getHeight() * scale));
            lefttackle4.scale((int)(lefttackle4.getWidth() * scale), (int)(lefttackle4.getHeight() * scale));
            lefttackle5.scale((int)(lefttackle5.getWidth() * scale), (int)(lefttackle5.getHeight() * scale));
            lefttackle6.scale((int)(lefttackle6.getWidth() * scale), (int)(lefttackle6.getHeight() * scale));
            lefttackle7.scale((int)(lefttackle7.getWidth() * scale), (int)(lefttackle7.getHeight() * scale));
            righttackle1.scale((int)(righttackle1.getWidth() * scale), (int)(righttackle1.getHeight() * scale));
            righttackle2.scale((int)(righttackle2.getWidth() * scale), (int)(righttackle2.getHeight() * scale));
            righttackle3.scale((int)(righttackle3.getWidth() * scale), (int)(righttackle3.getHeight() * scale));
            righttackle4.scale((int)(righttackle4.getWidth() * scale), (int)(righttackle4.getHeight() * scale));
            righttackle5.scale((int)(righttackle5.getWidth() * scale), (int)(righttackle5.getHeight() * scale));
            righttackle6.scale((int)(righttackle6.getWidth() * scale), (int)(righttackle6.getHeight() * scale));
            righttackle7.scale((int)(righttackle7.getWidth() * scale), (int)(righttackle7.getHeight() * scale));
          
          
            

    }
    
    public boolean inRangeToTackleLeft() {
        List<BoJackson> boJackson = getObjectsInRange(range, BoJackson.class);
        int differenceInY = 0;
        
        if(boJackson.size() != 0) {
           differenceInY =  Math.abs(boJackson.get(0).getY() - getY()); 
           if(boJackson.get(0).getX() < getX() && differenceInY < (range/2)) {
             return true;  
            }   
        }
        //Return false if out of range
        return false;
    }
    
    public boolean inRangeToTackleRight() {
        List<BoJackson> boJackson = getObjectsInRange(range, BoJackson.class);
        int differenceInY = 0;
        
        if(boJackson.size() != 0) {
           differenceInY =  Math.abs(boJackson.get(0).getY() - getY()); 
            
            if(boJackson.get(0).getX() > getX() && differenceInY < (range/2) ) {
                return true;
            }
        }
        //Return false if out of range
        return false;
    }
    
    public boolean inRangeToTackleBack() {
         List<BoJackson> boJackson = getObjectsInRange(range, BoJackson.class);
         int differenceInX = 0;
         
         if(boJackson.size() != 0) {
             differenceInX = Math.abs(boJackson.get(0).getX() - getX());
             
             if(boJackson.get(0).getY() > getY() && differenceInX < (range/2)) {
                 return true;
                }
            }

        //Return false if out of range
        return false;
    }
    
    public boolean inRangeToTackleForward() {
        List<BoJackson> boJackson = getObjectsInRange(range, BoJackson.class);
         int differenceInX = 0;
         
         if(boJackson.size() != 0) {
             differenceInX = Math.abs(boJackson.get(0).getX() - getX());
             
             if(boJackson.get(0).getY() < getY() && differenceInX < (range/2)) {
                 return true;
                }
             
            }
        
        //Return false if out of range 
        return false;
    }
    
       
    
    
    
    public void setLevel(int level) {
     this.level = level;   
    }
    
    public int getLevel() {
     return level;   
    }
    
    
    
}
