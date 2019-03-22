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
 public class cp extends Frame {                /*In this class the window that is displayed by the main methods object to this class is created */
                                                 
        
         JButton start;                         /*this declares the variable used to represent the "start" button that is displayed on the window*/   
   
   
    cp(){                                       /*the is the main method of the class that holds the objects to create the window and its componenets*/
        
        JFrame f = new JFrame("STEM Teacher");  /*This is the frame object of the java built-in class "Jframe" that is declared with the variable "f" to represent it. */
        
        JPanel p1 = new JPanel();               /*these are objects of the built-in java class "JPanel" that creates panels and declares them with a variable. These are the panels that will house the text area component.
                                                 */
        JPanel p2 = new JPanel();                
     
         
        
       TextArea area= new TextArea("");         /*this is the object that creates the "textarea" component and delacres a variable to represent */
        area.setBounds(10,30, 300,300);         /*this sets the default dimensions of the text area*/
        area.setEditable(false);                /*this is makes the textarea uneditable */
        p1.add(area);                           /*this adds the the area field to the panel declared as "p1"*/ 
       
    
        
        start = new JButton("Start");           /* this is the object for the "start" button*/
        
       
        
        
        p2.add(start);
        
       
       
        
        
        
        f.add(p1, "North");
        f.add(p2, "South");
      
        
        f.setVisible(true);
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        stepHandler starB = new stepHandler();
        start.addActionListener(starB);
    }
 }
   class stepHandler implements ActionListener {
          
        
            public void actionPerformed(ActionEvent c){
              
              
              new step(); 
            
        
        }
        }     
    
    


