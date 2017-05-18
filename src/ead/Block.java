/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead;

import java.awt.Image;

/**
 *
 * @author bruno.munhoz
 */
public class Block {
    boolean destroyed;
    boolean visible;
    int type;
    int[] pos = new int[2];
    Image backLayer;
    Image frontLayer;
    int res;
    int value;
    
    public Block(int type, int row, int column){
        this.destroyed = false;
        this.visible = false;
        this.type = type;
        this.pos[0] = row;
        this.pos[1] = column;
        createBackLayer();
    }
    
    private void createBackLayer(){
        if(this.type < 3){
            this.backLayer.getGraphics()
        } else {
            
        }
    }
    
    public void draw(){
        
    }
}
