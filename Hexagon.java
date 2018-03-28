import java.applet.*;
import java.awt.*;
public class Hexagon extends Applet
{
  int x[]={20,70,170,220,170,70,20};
  int y[]={100,13,13,100,186,186,100};
  int n=6;

public void paint(Graphics g)
{
 g.setColor(Color.orange);
 g.fillPolygon(x,y,n);
}
}

/*<Applet code = "Hexagon.class" width=400 Height=500>
</Applet>
*/



