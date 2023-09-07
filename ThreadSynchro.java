import java.util.Scanner;
class AdditionTable
{
	 synchronized public void printAdditionTable(int n)
	 {
		 System.out.println("Addition table of "+n+" is :\n");
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(n+" + "+i+" = "+(n+i));
			 try
			 {
				 Thread.sleep(1000);
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		 }
	 }
}
class Threada extends Thread
{
	AdditionTable a;
	public int n;
	Threada(AdditionTable a)
	{
		this.a=a;
	}
	public void run()
	{
		a.printAdditionTable(n);
	}
}
class Threadb extends Thread
{
	int n;
	AdditionTable a;
	Threadb(AdditionTable a)
	{
		this.a=a;
	}
	public void run()
	{
		a.printAdditionTable(n);
	}
}
class Threadc extends Thread
{
	int n;
	AdditionTable a;
	Threadc(AdditionTable a)
	{
		this.a=a;
	}
	public void run()
	{
		a.printAdditionTable(n);
	}
}
public class ThreadSynchro{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int num1=sc.nextInt();
	    System.out.print("Enter number 2 : ");
		int num2=sc.nextInt();
		System.out.print("Enter number 3 : ");
		int num3=sc.nextInt();
		AdditionTable a=new AdditionTable();
		Threada q1=new Threada(a);
		q1.n=num1;
		Threadb q2=new Threadb(a);
		q2.n=num2;
		Threadc q3=new Threadc(a);
		q3.n=num3;
		q1.start();
		q2.start();
		q3.start();
	}
}
