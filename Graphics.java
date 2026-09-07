import java.awt.*;
import java.awt.event.*;

public class Graphics extends Frame
{
    public Graphics()
    {
        setTitle("Graphics Event Demo");
        setSize(500, 500);
        setResizable(true);
        setVisible(true);
    }

    public void paint(java.awt.Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRoundRect(50, 50, 150, 150, 180, 180);
    }

    public static void main(String[] args)
    {
        new Graphics();
    }
}
