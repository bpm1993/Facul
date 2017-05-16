/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead;

import static java.awt.Color.BLUE;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author bruno.munhoz
 */
public class Player extends GameObject implements KeyListener {
    public Player(){
        this.color = BLUE;
        this.hp = 5;
        this.x = 0;
        this.y = 0;
        this.radius = 100;
   }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            this.acelarationX = -1;
            this.acelarationY  = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            this.acelarationX  = 1;
            this.acelarationY  = 0;
        }

        if (key == KeyEvent.VK_UP) {
            this.acelarationX  = 0;
            this.acelarationY  = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            this.acelarationX  = 0;
            this.acelarationY  = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
