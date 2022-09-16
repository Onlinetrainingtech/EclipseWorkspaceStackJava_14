class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("This is Base Class..");
	}
}
class D1 extends B
{
	int cid=2001;
	void get2()
	{
		System.out.println("This is Dervided class D1");
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("This is Dervided class D2"+pid+""+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
