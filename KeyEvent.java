import java.awt.*;
import java.awt.event.*;

public class keydemo extends Frame implements KeyListener
{
    public keydemo()
    {
        setTitle("KeyEvent Demo");
        setVisible(true);
        setSize(50,50);
        setResizable(false);
        addKeyListener(this);
    }
      public void keyReleased(KeyEvent e){}
      public void keyPressed(KeyEvent e){}
      public void keyTyped(KeyEvent e){
      char c=e.getKeyChar();
      if(c=='r'||c=='R')
      {
        setBackground((Color.red));
   }
      if (c=='g'||c=='G')
        {
        setBackground((Color.green));
  }
      if (c=='b'||c=='B')
       {
        setBackground((Color.blue));
  }
      if (c=='e'||c=='E')
      {
        dispose();
      System.exit(0);
}
    }
public static void main(String[] args)
{
     new keydemo();
}
}

