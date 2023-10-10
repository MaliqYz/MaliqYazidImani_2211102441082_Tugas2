import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        GreenfootImage img = new GreenfootImage("backgroundbird3.png");
        
        this.addObject(new Bird(),100,200);
        
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
        int x = rnd.nextInt(this.getWidth() - 1);
        int y = rnd.nextInt(this.getHeight());
        }

            
    }
            
}