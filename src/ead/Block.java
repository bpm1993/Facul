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
    
    public Block(String imgRes, int type, int row, int column){
        this.destroyed = false;
        this.visible = false;
        this.type = type;
        this.pos[0] = row;
        this.pos[1] = column;
        createBackLayer();
    }
    
    private void createBackLayer(){
        if(this.type < 3){
            this.backLayer = new ImageIcon(this.getClass().getResource("/textures/backLayer1.png")).getImage();
        } else {
            this.backLayer = new ImageIcon(this.getClass().getResource("/textures/backLayer2.png")).getImage();
        }
    }
    
    private void createFrontLayer(){
        if(this.type < 3){
            this.backLayer = new ImageIcon(this.getClass().getResource("/textures/backLayer1.png")).getImage();
        } else {
            this.backLayer = new ImageIcon(this.getClass().getResource("/textures/backLayer2.png")).getImage();
        }
    }

    private void defineAtt(){
        switch (type) {
            case 3:
                this.res = 1;
                this.value = 0;
                break;
            
            case 4:
                this.res = 3;
                this.value = 3;
                break;

            case 5:
                this.res = 5;
                this.value = 10;
                break;

            default:
                this.res = 0;
                this.value = 0;
                break;
        }
    }

    public void draw(Graphics g){
        if(this.destroyed){
            g.drawImage(this.backLayer, pos[0], pos[1]);
        } else {
            g.drawImage(this.frontLayer, pos[0], pos[1]);
        }
    }
}
