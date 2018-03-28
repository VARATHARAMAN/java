import java.applet.*;
import java.awt.*;
public class Hexagon2 extends Applet
{
  int x[]={20,70,170,220,170,70,20};
  int y[]={100,13,13,100,186,186,100};
  int n=6;
 int x1[]={240,290,390,440,390,290,240};
  int y1[]={100,13,13,100,186,186,100};
  int n1=6;

public void paint(Graphics g)
{
 g.setColor(Color.pink);
 g.fillPolygon(x,y,n);
 g.setColor(Color.black);
 g.drawPolygon(x1,y1,n1);
}
}

/*<Applet code = "Hexagon2.class" width=600 Height=500>
</Applet>
*/



