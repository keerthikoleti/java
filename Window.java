import java.awt.*;
import java.awt.event.*;

public class Window extends Frame implements WindowListener
{
    public Window()
    {
        setTitle("WindowEvent Demo");
        setVisible(true);
        setSize(1500,1500);
        setResizable(false);
        addWindowListener(this);
    }
public void windowClosing(WindowEvent e)
{
 dispose();
 System.exit(0);
}
public void windowOpened(WindowEvent e)
{
System.out.println("Window Opened");
}
public void windowClosed(WindowEvent e)
{
System.out.println("Window Closed");
}
public void windowActivated(WindowEvent e)
{
System.out.println("Window Activated");
}
public void windowDeactivated(WindowEvent e)
{
System.out.println("Window Deactivated");
}
public void windowIconified(WindowEvent e)
{
System.out.println("Window Iconified");
}
public void windowDeiconified(WindowEvent e)
{
System.out.println("Window Deiconified");
}
  public static void main(String[] args)
{
new Window();
}
}
