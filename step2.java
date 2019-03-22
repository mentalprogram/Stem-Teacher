/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cplusteacher;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DaDa
 */
public class step2 extends Frame {
      JButton stepB;
   
   
    step2(){
        
        JFrame f = new JFrame("STEM Teacher");
        JPanel p1 = new JPanel();
       
       
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
        
      

      
 
                
        
       TextArea area= new TextArea("Welcome to javatpoint");  
        area.setBounds(10,30, 300,300);  
        area.setEditable(false);
        p1.add(area);  
       
    
        
        stepB = new JButton("Next ");
        add(stepB);
       
        
        
        p2.add(stepB);
        
       
       
        
        
        
        f.add(p1, "North");
        f.add(p2, "South");
        
        
        f.setVisible(true);
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        stepHandler nextB = new stepHandler();
        stepB.addActionListener(nextB);
    }
 }
   class step3Handler implements ActionListener {
          
        
            public void actionPerformed(ActionEvent c){
              
              
              new step3(); 
            
        
        }
        }     
    