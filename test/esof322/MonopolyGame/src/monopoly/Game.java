package Monopoly;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game 
{

        //Logan Sucks
        public static void addComponentsToPane(Container pane) {
            
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
 
        addButton("Button 1", pane);
        
    }
 
    private static void addButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
 
    
    private static void showGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Test GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.setSize(500,500);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }
        });
    }
}
