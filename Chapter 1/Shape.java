import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import javax.print.FlavorException;

import javax.swing.JFrame;
 
public class Shape {
 https://docs.google.com/forms/d/e/1FAIpQLSeFDtxVH3k05KKlt-JztWlznlto0MzHeTi0krQcKwZeyEJbXw/viewform?usp=send_form
  public static void main(String[] args) {
 
// Create frame with specific title
 
JFrame frame = new JFrame("Example Frame");
 
// Create a component to add to the frame; in this case a text area with sample text
 
Component textArea = new TextArea("Sample text...");
 
// Create a component to add to the frame; in this case a button
 
Component button = new Button("Click Me!!");
 
// Add the components to the frame; by default, the frame has a border layout
 
frame.add(textArea, BorderLayout.NORTH);
 
frame.add(button, BorderLayout.SOUTH);
 
// Show the frame
 

frame.setSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
 
frame.setVisible(true);

frame.setResizable(false);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }
}

