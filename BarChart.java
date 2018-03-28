import java.awt.*;
import java.applet.*;
public class BarChart extends Applet
{
 public void paint(Graphics g)
{
  int a[]={40,50,60,50,70,80,90};
  g.drawLine(10,40,10,160);
  g.drawLine(10,160,200,160);
  for(int i=0;i<7;i++)
{
g.fillRect((20+i*20),(160-a[i]),15,a[i]);
}
g.drawString("bar chart of 7 months",10,180);
}
}

/*
<Applet code="BarChart.class" width=300 height=200>
</Applet>
*/
