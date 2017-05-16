/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author bruno.munhoz
 */
public class Jogo extends JPanel implements KeyListener{
    private boolean gameRunning;
    Player player;
    public Jogo(){
        JFrame frame = new JFrame("Ola Mundo Grafico");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(this);
        
        this.addKeyListener(this);
        setFocusable(true);
        this.setBackground(Color.white);
        
        setGameScene();
        
        gameRunning = true;
        run();
    }
    
    private void setGameScene(){
        player = new Player();
        
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(player.color);
        g.fillOval(player.getX(), player.getY(), player.getRadius(), player.getRadius());
    }
    
    public void actionPerformed() {
        player.move();
        repaint();  
    }
    
    public void update(){
        player.update();
    }
    
    public void run(){
        while(gameRunning){
            update();

            //Physics
            
            repaint();
            
            //Hold
            try{
                Thread.sleep(50);
            } catch(InterruptedException ex){
                
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        player.keyPressed(e);
        this.actionPerformed();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        player.keyReleased(e);
        this.actionPerformed();
    }
}