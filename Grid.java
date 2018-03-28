import java.awt.*;
 class Grid extends Frame
{
	
	Button b1,b2,b3,b4;
	public static void main(String a[])
	{
		Grid b=new Grid();
	}
public Grid()
{
	super("awt window with buttons");
	
	setLayout(new GridLayout(2,2));
	b1=new Button("B1");
	b2=new Button("B2");
	b3=new Button("B3");
	b4=new Button("B4");

	add(b1);
	add(b2);
	add(b3);
	add(b4);
setSize(300,250);

setVisible(true);


}
}
