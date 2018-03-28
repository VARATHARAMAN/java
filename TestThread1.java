import  java.lang.*;
class MyThread extends Thread
{
public MyThread()
{
	for(int i=1;i<=6;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t1=new Thread();
	t1.start();
	for(int i=7;i<12;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t2=new Thread();
	t2.start();
	
	}
public void run()
{
	for(int j=13;j<=18;j++)
	{
		System.out.println("the square root of"+j+" is " +Math.sqrt(j));
	}
}
}
 class TestThread1
{
public static void main(String a[])
{
MyThread m=new MyThread();


m.start();


}
}
