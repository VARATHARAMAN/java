import java.applet.*;
import java.awt.*;
public class ColorString extends Applet{
 String s1,s2,s3;
 public void init()
 {
  setSize(400,150);
  setBackground(Color.white);
  s1="this text is in red colour";
  s2="this text is in blue colour";
  s3="this text is in green colour";
  }
public void paint(Graphics g)
{
  g.setColor(Color.red);
  g.drawString(s1,20,20);
  g.setColor(Color.blue);
  g.drawString(s2,10,60);
  g.setColor(Color.green);
  g.drawString(s3,10,100);
}
}

/*<Applet code = "ColorString.class" width=300 Height=400>
</Applet>
*/


