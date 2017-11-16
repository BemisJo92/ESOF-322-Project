
package monopoly;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI extends JPanel{
    
    JFrame window;  //orig window
    static int[] p1Coords = new int[2];
    static int[] p2Coords = new int[2];
    static int[] p3Coords = new int[2];
    static int[] p4Coords = new int[2];
    
    public void setup()
    {
        
        //set origional player coords
        p1Coords[0] =490;
        p1Coords[1] = 490;
        
        p2Coords[0] =490;
        p2Coords[1] = 480;
        
        p3Coords[0] =490;
        p3Coords[1] = 470;
        
        p4Coords[0] =490;
        p4Coords[1] = 460;
        
        //update gui
        window = new JFrame();
        window.setBounds(0,0,600,600);
        window.getContentPane().add(new Canvas());
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setTitle("Monopoly!");
        
    }
    public static int[] getCoords(int player)
    {
        switch(player)
        {
            case 0:
                return p1Coords;
                
            case 1:
                return p2Coords;
                
            case 2:
                return p3Coords;
            case 3:
                return p4Coords;
            default:
                return null;
        }   
    }
    public void movePlayer(int player, int x, int y)
    {
        //set player coords
        switch(player)
        {
            case 0:
                p1Coords[0] = x;
                p1Coords[1] = y;
                break;
            case 1:
                p2Coords[0] = x;
                p2Coords[1] = y;
                break;
            case 2:
                p3Coords[0] = x;
                p3Coords[1] = y;
                break;
            case 3:
                p4Coords[0] = x;
                p4Coords[1] = y;
                break;
        }
        
          window.repaint(); //update jframe

    }
    
    public void display(String s)     //call instead of println's in rest of program to output text to gui.
    {
        
    }
    
}

class Canvas extends JComponent{
    private final int iconWidth = 20;
    private final int iconHeight = 20;
    private Image backgroundImage;
    
    private int p1X;
    private int p1Y;
    private int p2X;
    private int p2Y;
    private int p3X;
    private int p3Y;
    private int p4X;
    private int p4Y;
    
    public void paintComponent(Graphics g)
    {
        int p1X = GUI.getCoords(0)[0];
        int p1Y = GUI.getCoords(0)[1];
        int p2X = GUI.getCoords(1)[0];
        int p2Y = GUI.getCoords(1)[1];
        int p3X = GUI.getCoords(2)[0];
        int p3Y = GUI.getCoords(2)[1];
        int p4X = GUI.getCoords(3)[0];
        int p4Y = GUI.getCoords(3)[1];
        
        super.paintComponent(g);
        try
        {   
            backgroundImage = javax.imageio.ImageIO.read(new File("monopoly board.jpg"));
        }catch (IOException e) 
        {    
             throw new RuntimeException(e);
        }
        g.drawImage(backgroundImage, WIDTH, WIDTH, this);   //background image
       
        g.setColor(Color.blue);
        g.fillOval(p1X, p1Y, iconWidth, iconHeight); //p1
        g.setColor(Color.red);
        g.fillOval(p2X, p2Y, iconWidth, iconHeight); //p2
        g.setColor(Color.green);
        g.fillOval(p3X, p3Y, iconWidth, iconHeight); //p3
        g.setColor(Color.yellow);
        g.fillOval(p4X, p4Y, iconWidth, iconHeight); //p4
        }
    

}
