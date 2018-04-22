package actionevent;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class ActionEvent extends Applet
{
Label l=new Label("Click to submit");
@Override
public void init()
{
resize(500,500);
Button b=new Button("Submit");
add(b);
add(l);
setVisible(true);

b.addActionListener( new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
l.setText("you have pressed button");
setBackground(Color.green);
}
});
}
}
/*<Applet code = "Actionevent1.class" width=800 Height=500>
</Applet>
*/

