/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead;
import java.awt.Color;

/**
 *
 * @author bruno.munhoz
 */
public class GameObject {
    protected int hp;
    protected double speed;
    protected Color color;
    protected int radius;
    protected int x;
    protected int y;
    protected int acelarationX;
    protected int acelarationY;
    
    public void update(){
        this.radius = hp * 8;
        this.speed = hp * 2;
    }
    
    public void move(){
        this.x += this.acelarationX * this.speed;
        this.y += this.acelarationY * this.speed;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getRadius(){
        return this.radius;
    }
}
