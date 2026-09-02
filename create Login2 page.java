import java.awt.*;
import java.awt.event.*;
public class Login extends Frame
implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1;
public Login()
{
setLayout(new FlowLayout(FlowLayout.LEFT));
l1=new Label("USER NAME");
l2=new Label("PASSWORD");
l3=new Label("RESULT");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField('*');
b1=new Button( "Login");
t2.setEchoChar('@');
t3.setEditable(false);
add(l1);add(t1);
add(l2);add(t2);
add(b1);
add(t3);add(l3);
b1.addActionListener(this);
setTitle("ButtonEventDemo");
setVisible(true);
setSize(500,500);
}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("Login"))
{
String s1=t1.getText();
String s2=t2.getText();
if(s1.equals("VCE")&&(s2.equals("JAVA")))
{
t3.setText("valid");
}
else
{
t3.setText("Invalid");
}
}
}
public static void main(String[] args)
{
new Login();
}
}
