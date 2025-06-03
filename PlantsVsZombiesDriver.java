import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
//import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
//import java.awt.Font;
public class PlantsVsZombiesDriver extends JComponent implements KeyListener, MouseListener, MouseMotionListener{
    private int width, height;
    private long currentTime, waveTime;
    
    public PlantsVsZombiesDriver()
    {
        //initializing instance variables
        width = 1000;
        height = 500;
        
        //Setting up the GUI

    }
    //This method will acknowledge user input
    public void keyPressed(KeyEvent e) 
    {
        //getting the key pressed

        //moving the rectangle

    }   
    //All your UI drawing goes in here
    public void paintComponent(Graphics g)
    {
        //Drawing a Blue Rectangle to be the background

        //Drawing Hello World!! at the center of the GUI

        //Drawing the user-controlled rectangle

        //Drawing the autonomous circle

    }
    public void loop()
    {
        //making the autonomous circle move
        
        //handling when the circle collides with the edges

        //handling the collision of the circle with the rectangle

        //Do not write below this
        repaint();
    }
    //These methods are required by the compiler.  
    //You might write code in these methods depending on your goal.
    public void keyTyped(KeyEvent e) 
    {
    }
    public void keyReleased(KeyEvent e) 
    {
    }
    public void mousePressed(MouseEvent e)
    {
    }
    public void mouseReleased(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
    }
    public void mouseEntered(MouseEvent e)
    {
    }
    public void mouseExited(MouseEvent e)
    {
    }
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mouseDragged(MouseEvent e)
    {
    }
    public void start(final int ticks){
        Thread gameThread = new Thread(){
            public void run(){
                while(true){
                    loop();
                    try{
                        Thread.sleep(1000 / ticks);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };	
        gameThread.start();
    }

    public static void main(String[] args)
    {
        PlantsVsZombiesDriver g = new PlantsVsZombiesDriver();
        g.start(60);
    }
}

    