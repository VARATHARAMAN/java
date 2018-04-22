/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventlistener;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class EventListener extends Frame
{
public static void main(String[] args)
{
EventListener ie=new EventListener();
}
Label l1=new Label("Click on your choice");
Label l2=new Label();
public EventListener()
{
	super("Event handling");
	List l=new List();
	add(l1,BorderLayout.CENTER);
	add(l2,BorderLayout.SOUTH);
	l.add("north");
	l.add("south");
	l.addItemListener(new ItemListener()
	{
		public void itemStateChanged(ItemEvent te)
		{
			l1.setText("You have choosen"+te.getItem()+te.getItemSelectable());;
	}});
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
	}});
	add(l,BorderLayout.NORTH);
	setSize(800,200);
	setVisible(true);
}
}
	

/*<Applet code = "ItemEventListener.class" width=800 Height=500>
</Applet>
*/