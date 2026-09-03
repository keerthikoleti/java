import java.awt.*;
import java.awt.event.*;

public class Scrollbar extends Frame implements AdjustmentListener
{
    java.awt.Scrollbar b1,b2,b3;

    public Scrollbar()
    {
        setLayout(new BorderLayout());

        b1=new java.awt.Scrollbar(java.awt.Scrollbar.VERTICAL,0,10,0,255);
        b2=new java.awt.Scrollbar(java.awt.Scrollbar.VERTICAL,0,10,0,255);
        b3=new java.awt.Scrollbar(java.awt.Scrollbar.HORIZONTAL,0,10,0,255);

        add(b1,"East");
        add(b2,"West");
        add(b3,"South");

        b1.addAdjustmentListener(this);
        b2.addAdjustmentListener(this);
        b3.addAdjustmentListener(this);

        setTitle("Scrollbar");
        setVisible(true);
        setSize(500,500);
    }

    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        int x=b1.getValue();
        int y=b2.getValue();
        int z=b3.getValue();

        Color c=new Color(x,y,z);
        setBackground(c);
    }

    public static void main(String[] args)
    {
        new Scrollbar();
    }
}
