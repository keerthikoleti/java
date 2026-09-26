import java.awt.*;
import java.awt.event.*;

public class FlowLayout extends Frame implements ActionListener {

    Button b1, b2, b3, b4;

    public button() {

        setLayout(new FlowLayout());

        b1 = new Button("Nokia");
        b2 = new Button("Moto");
        b3 = new Button("iphone");
        b4 = new Button("exit");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setTitle("Propose Events Demo");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if (s.equals("Nokia")) {
            setBackground(new Color(110, 9, 26));
            b1.setForeground(Color.red);
        }

        if (s.equals("Moto")) {
            setBackground(new Color(9, 120, 57));
            b2.setForeground(Color.green);
        }

        if (s.equals("iphone")) {
            setBackground(new Color(78, 67, 56));
            b3.setForeground(Color.blue);
        }

        if (s.equals("exit")) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
         FlowLayout fl = new FlowLayout();
    }
}
