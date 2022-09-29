class Demo extends Thread
{
	synchronized void get1() throws InterruptedException
	{
		System.out.println("WaitIn");
		wait(10000);
		System.out.println("WaitOut");
	}
	synchronized void get2()
	{
		System.out.println("NotifyIn");
		notify();
		System.out.println("NotifyOut");
	}
}
public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		Demo t1=new Demo();
		t1.get1();
		t1.get2();

	}

}
