import java.awt.*;
import java.awt.event.*;

public class Checkbox extends Frame implements ItemListener
{
java.awt.Checkbox c1,c2,c3,c4,c5;
TextField t1;
CheckboxGroup cbg;
Label l1;

public Checkbox()
{
setLayout(new FlowLayout());

c1=new java.awt.Checkbox("KTM");
c2=new java.awt.Checkbox("Pulsar");
c3=new java.awt.Checkbox("Bullet");

cbg=new CheckboxGroup();

c4=new java.awt.Checkbox("ABS",cbg,false);
c5=new java.awt.Checkbox("Disc",cbg,false);

l1=new Label("enter your choice");
t1=new TextField(50);

c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
c4.addItemListener(this);
c5.addItemListener(this);

add(l1);
add(c4);
add(c5);
add(c1);
add(c2);
add(c3);
add(t1);

setTitle("Checkbox");
setVisible(true);
setSize(500,500);
}

public void itemStateChanged(ItemEvent e)
{
String s="selected ";

if(c4.getState()==true)
{
s+="ABS ";
}

if(c5.getState()==true)
{
s+="Disc ";
}

if(c1.getState()==true)
{
s+="KTM ";
}

if(c3.getState()==true)
{
s+="Bullet ";
}

if(c2.getState()==true)
{
s+="Pulsar ";
}

t1.setText(s);
}

public static void main(String[] args)
{
new Checkbox();
}
}
