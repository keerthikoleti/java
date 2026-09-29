import java.awt.*;
import java.awt.event.*;
public class BorderLayout extends Frame implements AdjustmentListener
{
Scrollbar b1,b2,b3;
public BorderLayout(){
setLayout(new BorderLayout());
b1 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
b2 = new Scrollbar(Scrollbar.VERTICAL,0,10,0,255);
b3 = new Scrollbar(Scrollbar.HORIZONTAL,10,10,15,255);
add(b1,"East");
add(b2,"West");
add(b3,"South");
b1.addAdjustmentListener(this);
b2.addAdjustmentListener(this);
b3.addAdjustmentListener(this);
b1.setUnitIncrement(50);
b3.setBlockIncrement(50);
setTitle("Scroll event Demo");
setSize(500, 500);
setResizable(true);
setVisible(true);
}
public void adjustmentValueChanged(AdjustmentEvent e){
int x = b1.getValue();
int y = b2.getValue();
int z = b3.getValue();
Color c = new Color(x,y,z);
setBackground(c);
}
public static void main(String[] args){
new BorderLayout();
}

}
