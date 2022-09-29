class Demo extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException t)
		{
			
		}
		System.out.println("This is an Run Method...");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		try
		{
			System.out.println("JoinIn");
			t1.join(10000);
			System.out.println("JoinOut");
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
		t2.start();

	}

}
