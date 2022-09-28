class Demo implements Runnable
{
	public void run()
	{
		System.out.println("This is a Thread Method..");
		get1();
	}
	void get1()
	{
		System.out.println("This is a Normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Thread d1=new Thread(t1);
		d1.start();//To start the Thread
		

	}

}
