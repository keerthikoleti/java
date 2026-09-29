import java.awt.*;
import java.awt.event.*;


public class GridLayout extends Frame{
public GridLayout(){
setLayout(new GridLayout(4,5));
int i;
for(i = 1;i<=20;i++){
add(new Button("Login" +i));
}
	setTitle("Button event Demo");
        setSize(500, 500);
        setResizable(true);
        setVisible(true);
}
public static void main(String[] args){
new GridLayout();
}
}
