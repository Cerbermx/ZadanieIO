/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Damian
 */
public class GAMEPanel  extends JPanel implements ActionListener{
    
    static final int SCREEN_WIDTH = 900;
    static final int SCREEN_HEIGHT = 900;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int [GAME_UNITS];
    final int y[] = new int [GAME_UNITS];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = 'U';
    boolean running = false;
    Timer timer;
    Random random;
    
    GAMEPanel(){
    
    }
    
    public void startGame(){
        
    }
    
    public void paintComponent(Graphics g){
        
    }
    
    public void draw(Graphics g){
        
    }
    
    public void move(){
        
    }
    
    public void checkApple(){
        
    }
    public void checkCollisions(){
        
       
    }
    
    public void gameOver(Graphics g){
        
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
        }
    }
}
