class Demo
{
	void get1()
	{
		try
		{
		int a=100,c;
		c=a/0;
		System.out.println("Your value is::"+c);
		}
		catch(ArithmeticException t)
		{
			System.out.println("please check your value"+t);
		}
		get2();
	}
	void get2()
	{
		try
		{
			String name=null;
			System.out.println("This is get2 function!!!!"+name.length());
		}
		catch(NullPointerException r)
		{
			System.out.println(r);
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
