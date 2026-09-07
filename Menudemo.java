import java.awt.*;
import java.awt.event.*;

public class Menudemo extends Frame
{
    TextArea t;

    public Menudemo()
    {
        t = new TextArea();
        add(t);

        Menu m = new Menu("file");

        MenuBar mb = new MenuBar();

        MenuItem newItem = new MenuItem("new");
        MenuItem openItem = new MenuItem("open");
        MenuItem saveItem = new MenuItem("save");
        MenuItem exitItem = new MenuItem("exit");

        m.add(newItem);
        m.add(openItem);
        m.add(saveItem);
        m.add(exitItem);

        mb.add(m);
        setMenuBar(mb);

        setTitle("Menu Demo");
        setSize(500, 500);
        setResizable(true);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Menudemo();
    }
}
