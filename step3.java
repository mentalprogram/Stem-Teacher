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
public class step3 extends Frame {
      JButton stepC;
   
   
    step3(){
        
        JFrame f = new JFrame("STEM Teacher");
        JPanel p1 = new JPanel();
        
        
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        
      

      
 
                
        
       TextArea area= new TextArea("Welcome to javatpoint");  
        area.setBounds(10,30, 300,300);  
        area.setEditable(false);
        p1.add(area);  
       
    
        
        stepC = new JButton("Next ");
        add(stepC);
       
        
        
        p2.add(stepC);
        
       
       
        
        
        
        f.add(p1, "North");
        f.add(p2, "South");
        
        
        f.setVisible(true);
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        stepHandler nextC = new stepHandler();
        stepC.addActionListener(nextC);
    }
 }
   class step4Handler implements ActionListener {
          
        
            public void actionPerformed(ActionEvent c){
              
              
              new step4(); 
            
        
        }
        }     
    