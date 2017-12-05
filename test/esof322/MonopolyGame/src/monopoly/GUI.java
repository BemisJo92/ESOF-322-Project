
package monopoly;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;


public class GUI extends JPanel{
    
    JFrame window;  //orig window
    JFrame txtWindow; //text display window
    JPanel buttonPanel;   //button panel
    JTextArea textArea; //text display
    JButton b0;
    JButton b1;
    JButton b7;
    int lineCounter;    //counter for lines in display window. 
    static int theme = 0;
    String displayMessage;
    static int[] p1Coords = new int[2];
    static int[] p2Coords = new int[2];
    static int[] p3Coords = new int[2];
    static int[] p4Coords = new int[2];
    
    public GUI(int theme)
    {
        this.theme = theme;
    }
    public static int getTheme()
    {
        return theme;
    }
    public void setup()
    {
        lineCounter = 0;
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
        
       
        
        buttonPanel = new JPanel();
        buttonPanel.setLocation(600,0);
        buttonPanel.setBackground(Color.gray);
        buttonPanel.setVisible(true);
        //buttonPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b0 = new JButton("No/0");
        b1 = new JButton("Yes/1");
        b7 = new JButton("Proceed/7");
        buttonPanel.add(b0);
        buttonPanel.add(b1);
        buttonPanel.add(b7);
        window.add(buttonPanel);
        
        txtWindow = new JFrame();
        txtWindow.setBounds(0,600,300,300);
        txtWindow.getContentPane();
        txtWindow.setVisible(true);
        txtWindow.setTitle("TextOutput");
        txtWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        textArea = new JTextArea(5,10);
        textArea.setLocation(800,800);
        txtWindow.add(textArea);
        textArea.setVisible(true);
        textArea.append("Welcome!");
        DefaultCaret caret = (DefaultCaret)textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        
        
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               //something to do when b0 is pressed 
                displayMessage=("Button 0 pressed");
                System.out.println(displayMessage);
            }
        });
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               //something to do when b0 is pressed 
                displayMessage=("Button 1 pressed");
                System.out.println(displayMessage);
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
               //something to do when b0 is pressed 
                displayMessage=("Button 7 pressed");
                System.out.println(displayMessage);
            }
        });
        
        
                       
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
//        if(lineCounter > 30)    //if text area is too large,erase it
//        {
//            textArea.selectAll();
//            textArea.replaceSelection("");
//            lineCounter = 0;
//        }
        //append data
        textArea.append("\n");
        textArea.append(s);
        lineCounter +=2;
    }
    
    public void clearDisplay()
    {
        textArea.selectAll();
        textArea.replaceSelection("");
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
        
        try
        {  
            if(GUI.getTheme() == 1)
            {
                backgroundImage = javax.imageio.ImageIO.read(new File("monopoly board.jpg"));
            }else if(GUI.getTheme() == 2)
            {
               //national park themed
                backgroundImage = javax.imageio.ImageIO.read(new File("nationalParksBoard.jpg"));
            }
            else
            {
                System.out.println("error in gui background");
            }
            
        }catch (IOException e) 
        {    
             throw new RuntimeException(e);
        }
        
        super.paintComponent(g);
        
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
