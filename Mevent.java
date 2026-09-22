import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mevent extends JFrame
{
    JLabel l1;
    JPanel p1;
    Container c;

    public Mevent() 
    {
        c = getContentPane();

        l1 = new JLabel("Show Coordinates");

        setTitle("Mevent ");
        setSize(400, 300);
        setResizable(false);
        setVisible(true);

        addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                int x = e.getX();
                int y = e.getY();

                l1.setText("X: " + x + "  Y: " + y);
            }
        });

        p1 = new JPanel();
        p1.add(l1);
        c.add(p1, BorderLayout.SOUTH);
    }

    public static void main(String[] args)
    {
       Mevent m = new Mevent();
    }
}
