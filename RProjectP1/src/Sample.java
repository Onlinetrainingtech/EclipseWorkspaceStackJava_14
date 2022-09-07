class Demo
{
	int a=100,b=200;//class or instance variable
	void get1()
	{
		System.out.println("Welcome to Get1 method.."+(a*b));
	}
	void get2()
	{
		System.out.println("Welcome to Get2 method.."+(a>b));
	}
}


public class Sample {

	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.get1();
		d1.get2();
	}

}
