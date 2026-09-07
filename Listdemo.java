import java.awt.*;
import java.awt.event.*;

public class Listdemo extends Frame implements ItemListener
{
    List l;

    public Listdemo()
    {
        setLayout(new FlowLayout());

        l = new List(3, true);

        l.addItem("Lingampally");
        l.addItem("Tankbund");
        l.addItem("Phalaknama");

        l.addItemListener(this);

        add(l);

        setTitle("List Demo");
        setSize(500, 500);
        setResizable(true);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        repaint();
    }

    public void paint(java.awt.Graphics g)
    {
        String s[] = l.getSelectedItems();
        int n = s.length;
        int y = 180;

        for (int i = 0; i < n; i++, y += 20)
        {
         g.drawString("Most happened places " + (i + 1) + ": " + s[i], 100, y);
        }
    }

    public static void main(String[] args)
    {
        new Listdemo();
    }
}
