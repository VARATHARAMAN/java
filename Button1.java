import java.awt.*;
 class Button1 extends Frame
{
	TextField t1,t2;
	Label l1,l2;
	Button b1,b2;
	public static void main(String a[])
	{
		Button1 b=new Button1();
	}
public Button1()
{
	super("awt window with buttons");
	
	setLayout(new FlowLayout());
	t1=new TextField(20);
	t2=new TextField(20);
	l1=new Label("name");
	l2=new Label("address");
	b1=new Button("submit");
	b2=new Button("cancel");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
setSize(500,250);
setVisible(true);
}
}
