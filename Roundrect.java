import java.awt.*;
import java.applet.*;
public class Roundrect extends Applet
{
  public void paint(Graphics g)
{
 g.setColor(new Color(64,64,64));
 g.fillRoundRect(10,10,100,50,20,10);
 g.setColor(Color.blue);
 g.fillRoundRect(120,10,100,50,10,10);
}
}


/*
<Applet code="Roundrect.class" width=300 height=200>
</Applet>
*/
