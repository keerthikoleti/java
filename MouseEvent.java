import java.awt.*;
import java.awt.event.*;

public class mouseevent extends Frame implements MouseListener
{
    public mouseevent()
    {
        setTitle("MouseEvents demo");
        setVisible(true);
        setSize(50,50);
        setResizable(false);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e)
    {
        setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
    }

    public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.blue);
    }

    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.cyan);
    }

    public void mouseReleased(MouseEvent e)
    {
        setBackground(Color.red);
    }

    public void mousePressed(MouseEvent e)
    {
        setBackground(Color.black);
    }

    public static void main(String[] args)
    {
        mouseevent m = new mouseevent();
    }
}





