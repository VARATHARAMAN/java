import  java.lang.*;
class MyThread extends Thread
{
public MyThread()
{
	for(int i=1;i<=2500;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t1=new Thread();
	t1.start();
	for(int i=2501;i<5000;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t2=new Thread();
	t2.start();
	for(int i=5001;i<7500;i++)
	{
		System.out.println("the square root of "+i+"is "+Math.sqrt(i));
	}
	Thread t3=new Thread();
	t3.start();
	}
public void run()
{
	for(int j=7501;j<=10000;j++)
	{
		System.out.println("the square root of"+j+" is " +Math.sqrt(j));
	}
}
}
 class TestThread2
{
public static void main(String a[])
{
MyThread m=new MyThread();


m.start();


}
}
