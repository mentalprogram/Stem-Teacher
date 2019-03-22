/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cplusteacher;

import javafx.scene.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javafx.scene.paint.*; 
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.*;  
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.io.*;
import javax.imageio.ImageIO;

import javax.swing.JPanel;


/**
 *
 * @author DaDa
 */
 public class step extends Frame {
        
         JButton stepA;
   
   
    step(){
        
        JFrame f = new JFrame("STEM Teacher");
        JPanel p1 = new JPanel();
     
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
       
      

       
                
        
       TextArea area= new TextArea("Welcome to javatpoint");  
        area.setBounds(10,30, 300,300);  
        area.setEditable(false);
        p1.add(area);  
       
    
        
        stepA = new JButton("Next");
        add(stepA);
       
        
        
        p2.add(stepA);
        
       
       
        
        
        
        f.add(p1, "North");
        f.add(p2, "South");
       
        
        f.setVisible(true);
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        stepAHandler nextA = new stepAHandler();
        stepA.addActionListener(nextA);
    }
 }
   class stepAHandler implements ActionListener {
          
        
            public void actionPerformed(ActionEvent c){
              
              
              new step2(); 
            
        
        }
        }     
    
    


