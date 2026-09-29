import java.awt.*;
import java.awt.event.*;
public class flowlayout extends Frame implements ActionListener{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1;
public flowlayout(){
setLayout(new FlowLayout(FlowLayout.LEFT));
l1 = new Label("USER NAME");
l2 = new Label("PASSWORD");
l3 = new Label("RESULT");
t1 = new TextField(10);
t2 = new TextField(10);
t3 = new TextField(10);
b1 = new Button("continue");
t2.setEchoChar('@');
t3.setEditable(false);
add(t1);
add(t2);
add(t3);
add(l1);
add(l2);
add(l3);
add(b1);
b1.addActionListener(this);
setTitle("Button event Demo");
setSize(500, 500);
setResizable(true);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s = e.getActionCommand();
if(s.equals("Login")){
String s1 = t1.getText();
String s2 = t2.getText();
if((s1.equals("vce"))&&(s2.equals("java"))){
t3.setText("Valid");
}
else{
t3.setText("Invalid");
}
}
}
public static void main(String[] args){
new flowlayout();
}
}
