import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class cardlayout extends JFrame implements ActionListener
{
    Container c;
    CardLayout Cn;
    JButton b1, b2, b3;

    public cardlayout()
    {
        c = getContentPane();

        Cn = new CardLayout();
        c.setLayout(Cn);

        b1 = new JButton("Computer");
        b2 = new JButton("Science");
        b3 = new JButton("Engineering");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add(b1);
        c.add(b2);
        c.add(b3);

        setTitle("Card Layout");
        setSize(500, 500);
        setVisible(true);
        setResizable(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Cn.next(c);
    }

    public static void main(String[] args)
    {
        new cardlayout();
    }
}
