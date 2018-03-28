import java.applet.*;
import java.awt.*;
import java.awt.Image;
import java.awt.Graphics;
public class Animation extends Applet implements Runnable
{
 Thread th;
 Image[]img;
 int imgCount=3;
 int imgDelay=300;
 int currentImg=0;
 

public void init()
{
  th=new Thread(this);
  img=new Image[3];
  img[0]=getImage(getCodeBase(),"image1.gif");
  img[1]=getImage(getCodeBase(),"image2.gif");
  img[2]=getImage(getCodeBase(),"image3.gif");
 th.start();
}

public void paint(Graphics g)
{
 g.drawImage(img[currentImg],5,5,this);
}
public void run()
{
while(true)
{
repaint();
++currentImg;
currentImg %=imgCount;
try
{
Thread.sleep(imgDelay);
}
catch(InterruptedException ie)
{
System.out.println("error"+ie);
}
}
}
}


/*<Applet code = "Animation.class" width=800 Height=500>
</Applet>
*/

