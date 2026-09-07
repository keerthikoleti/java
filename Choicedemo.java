import java.awt.*;
import java.awt.event.*;

public class choicedemo extends Frame implements ItemListener
{
    Choice v;
    TextField t;

    public choicedemo()
    {
        setLayout(new FlowLayout());

        v = new Choice();
        t = new TextField(30);

        v.addItem("JAVA");
        v.addItem("Python");
        v.addItem("C++");
        v.addItem("RUBY");
        v.addItem("Dot.Net");

        v.addItemListener(this);

        add(v);
        add(t);

        setTitle("Choice Demo");
        setSize(500, 500);
        setResizable(true);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        String s = v.getSelectedItem();
        int x = v.getSelectedIndex();

        t.setText("You have selected S.NO " + (x + 1) + " which is " + s);
    }

    public static void main(String[] args)
    {
        new choicedemo();
    }
}
