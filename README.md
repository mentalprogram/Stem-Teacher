# Stem-Teacher
Stem Teacher first code

This application is to be able to teach coding to an idividual.This is the rough skeleton of the application. It does the basics of input
and out. When the program is finish it should allow the user to go line by line with explanaition of each line. It will then allow the user
to take the code they have learned and connect it in blocks to create the program.


package cplusteacher;				
						 
import java.awt.Frame;				 
						 
import java.awt.TextArea;     			 

import java.awt.event.ActionEvent;		 #These are java Built-in classes that are used

import java.awt.event.ActionListener;		 

import javax.swing.JButton;			 

import javax.swing.JFrame;			 
						 
import javax.swing.JPanel;			


public class Cplusteacher {			

  /* This is the main method of the program that obtains an object to the cp class.
   * This method starts the program displaying a Window that has a button component labeled "start"
   * and a text area component.
   */
    
 public static void main(String[] args) {
     
new cp();  
   }
}

The other classes so far enanct the exact same compnents just with different text in the text area and the button being labeled "next" to
move to the next step.

 
public class cp extends Frame {                /*In this class the window that is displayed by the main methods object to this class is 
                                                created */
                                                 
        
         JButton start;                         /*this declares the variable used to represent the "start" button that is displayed on 
                                                  the window*/   
   
   
  cp(){                                       /*the is the main method of the class that holds the objects to create the window and 
                                                  its componenets*/
        
        JFrame f = new JFrame("STEM Teacher");  /*This is the frame object of the java built-in class "Jframe" that is declared with the 
                                                  variable "f" to represent it. */
        
        JPanel p1 = new JPanel();               /*these are objects of the built-in java class "JPanel" that creates panels and declares 
                                                  them with a variable. These are the panels that will house the text area component.
                                                 */
        JPanel p2 = new JPanel();                
     
         
        
       TextArea area= new TextArea("");         /*this is the object that creates the "textarea" component and delacres a variable to 
                                                  represent */
        area.setBounds(10,30, 300,300);         /*this sets the default dimensions of the text area*/
        area.setEditable(false);                /*this is makes the textarea uneditable */
        p1.add(area);                           /*this adds the the area field to the panel declared as "p1"*/ 
        
        start = new JButton("Start");           /* this is the object for the "start" button*/
        
       
        
        
        p2.add(start);				/*this adds the "start" button to the p2 panel*/
        
       
       
        
        
        
        f.add(p1, "North");			/* here we add the two panels to the window
        f.add(p2, "South");			 */
      
        
        f.setVisible(true);				     /* here the window is set to be displayed. 
        f.setSize(500, 400);				      * the default size is set
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  */the action for the close button is declared
        
        Handler starB = new Handler();			     /* this creates an object of the handler class, declares a variable, and 
        start.addActionListener(starB);			      * adds an listener to listen for when the button is pressed
							      */
    }
 }
   
   class Handler implements ActionListener {		     /* this is the handler class that inherits the components of the java built-in
							                                          class "ActionListener"*/
          
        
   public void actionPerformed(ActionEvent c){      /*this the method of the class that enacts the action when the button is 
                                                           pressed*
              
              
              new step(); 				     /*this is the object that is called for the step class to display the next window*/
            
        
        }
        }     
    
       
    
