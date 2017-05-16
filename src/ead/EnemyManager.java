/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno.munhoz
 */
public class EnemyManager {
    List<Enemy> enemyList = new ArrayList<>();
    private int nextX;
    private int nextY;
    
    public void update(){
        for(int i = 0; i < enemyList.size(); i++){
            enemyList.get(i).update();
        }
    }
    
    public void createEnemy(){
           enemyList.set(enemyList.size(), new Enemy(nextX, nextY));
    }
}
