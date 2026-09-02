import java.awt.*;
import java.awt.event.*;

public class Login extends Frame implements TextListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;

    public Login()
    {
        setLayout(new GridLayout(3,2));

        l1 = new Label("USERNAME");
        l2 = new Label("PASSWORD");
        l3 = new Label("RESULT");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);

        t2.setEchoChar('*');
        t3.setEditable(false);

        t1.addTextListener(this);
        t2.addTextListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        setTitle("Login");
        setVisible(true);
        setSize(1000,1000);
        setResizable(false);
    }

    public void textValueChanged(TextEvent e)
    {
        String s1 = t1.getText();
        String s2 = t2.getText();

        if(s1.equals("VCE") && s2.equals("java"))
        {
            t3.setText("VALID");
        }
        else
        {
            t3.setText("INVALID");
        }
    }

    public static void main(String args[])
    {
        new Login();
    }
}
