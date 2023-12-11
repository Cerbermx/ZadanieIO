/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import javax.swing.JFrame;

/**
 *
 * @author Damian
 */
public class GAMEFrame extends JFrame{
    
    GAMEFrame(){
       // GAMEPanel panel = new GAMEPanel();
       // this.add(panel);
       // to samo
       this.add(new GAMEPanel());
       this.setTitle("Żmij");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);
    }
    
}
