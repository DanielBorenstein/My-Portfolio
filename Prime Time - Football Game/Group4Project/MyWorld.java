import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
     private int level;
     FieldLine f1 = new FieldLine();
     FieldLine f2 = new FieldLine();
     FieldLine f3 = new FieldLine();
     FieldLine f4 = new FieldLine();
     FieldLine f5 = new FieldLine();
     FieldLine f6 = new FieldLine();
     FieldLine f7 = new FieldLine();
     FieldLine f8 = new FieldLine();
     FieldLine f9 = new FieldLine();
     FieldLine f10 = new FieldLine();
     FieldLine f11 = new FieldLine();
     FieldLine f12 = new FieldLine();
     FieldLine f13 = new FieldLine();
     FieldLine f14 = new FieldLine();
     FieldLine f15 = new FieldLine();
     Lighting lighting = new Lighting();
     int move = 0;
     int moveCount = 0;
     YardCounter yardCounter = new YardCounter();
     BoJackson player1 = new BoJackson();
     int boJackX = 0;
     int boJackY = 0;
     BoJacksonFace face = new BoJacksonFace();
     int faceScore = 0;
     int faceCount = 0;
     int faceTimer = 0;
     int faceTimer1 = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        //Initializes world and sets background
        super(900, 900, 1, false); 
        
        
        
        
        
        
        GreenfootImage field = new GreenfootImage("footballfield.png");
        setBackground(field);
        
        //Sets field lines
         
        addObject(f1, 450, 450);
         
        addObject(f2,450, 450 - 900);
        addObject(f3, 450, 450 - 900 - 900);
        
        addObject(f4,450, 450 - 900 * 3);
         
        addObject(f5,450, 450 - 900 * 4);
        
        addObject(f6,450, 450 - 900 * 5);
         
        addObject(f7,450, 450 - 900 * 6);
        
        addObject(f8,450, 450 - 900 * 7);
        
        addObject(f9,450, 450 - 900 * 8);
         
        addObject(f10,450, 450 - 900 * 9);
         
        addObject(f11,450, 450 - 900 * 10);
         
        addObject(f12,450, 450 - 900 * 11);
         
        addObject(f13,450, 450 - 900 * 12);
         
        addObject(f14,450, 450 - 900 * 13);
        
        addObject(f15,450, 450 - 900 * 14);
        
        
        //Initializes Player 
        
        addObject(player1, 450, 800);
        
        //Initializes Defenders
        Defender defender1 = new Defender(1);
        Defender defender2 = new Defender(1);
        Defender defender3 = new Defender(1);
        addObject(defender1, 450, 100);
        addObject(defender2, 150, 100);
        addObject(defender3, 650, 100);
        Defender defender4 = new Defender(2);
        Defender defender5 = new Defender(2);
        Defender defender6 = new Defender(2);
        addObject(defender4, 450 ,0 );
        addObject(defender5, 150 ,0 );
        addObject(defender6, 650, 0 );
        
        
        //new code
        
        addObject (face, 2000,2000);
        addObject (lighting, 20, 800);
        addObject (yardCounter, 450, 25);
        BackButton backbutton1 = new BackButton();
        addObject (backbutton1, 856, 28);
        
    }
    
    public void setLevel(int level){
      this.level = level;  
    }
    
    public int getLevel(){
        return this.level;
    }
    
    public void advanceToNextLevel(){
        level += 1;
    }
    
    public void act() {
        boJackX = player1.getX();
        boJackY = player1.getY();
        if (lighting.touchingPlayer()) {
            move = 1;
        }
        /**
        if (face.touchingPlayer()) {
            faceScore = 1;
        }
        if (faceScore == 1) {
            if (Greenfoot.isKeyDown("w")) {
                yardCounter.yardMover();
                yardCounter.yardMover();
                yardCounter.yardMover();
                yardCounter.yardMover();
                yardCounter.yardMover();
            }
            faceCount++;
        }
        if (faceCount >= 100) {
            faceScore = 0;
            faceCount = 0;
            face.setLocation(2000,2000);
        }
        if (yardCounter.getScore() > 0 && yardCounter.getScore() % 100 == 0) {
         face.setLocation(436,816);  
         faceTimer = 1;
        }
        if (faceTimer == 1) {
            faceTimer1++;
        }
        if (faceTimer1 >= 250) {
            faceTimer = 0;
            faceTimer1 = 0;
        }
        
        if (move == 1) {
            
            yardCounter.yardMover();
            f1.moveLine();
            f2.moveLine();
            f3.moveLine();
            f4.moveLine();
            f5.moveLine();
            f6.moveLine();
            f7.moveLine();
            f8.moveLine();
            f9.moveLine();
            f10.moveLine();
            f11.moveLine();
            f12.moveLine();
            f13.moveLine();
            f14.moveLine();
            moveCount++;
        }
        */
        if (moveCount >= 500) {
            move = 0;
            moveCount = 0;
        }
        
    }
    
}
