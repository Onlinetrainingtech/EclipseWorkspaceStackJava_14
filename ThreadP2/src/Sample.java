class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIn");
//			for(int i=0;i<=5;i++)
//			{
//				System.out.println("I value is::"+i);
//				Thread.sleep(10000);
//			}
			Thread.sleep(10000);
			System.out.println("Your Current Thread name is::"+currentThread().getName());
			System.out.println("Your Thread Priority::"+currentThread().getPriority());
			System.out.println("ThreadOut");
			
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t1.setName("Priyanka");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t2.setName("Gayathri");
		t2.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.isInterrupted());
		System.out.println(t1.isAlive());

	}

}
