class B
{
	String pname="mobile";
	int pid=1001;
	 void get1()
	{
		System.out.println("This is Base Class"+pid);
	}
}
class D extends B
{
	void get2()
	{
		int pid=2001;
		System.out.println("This is Der Class"+pname+""+super.pid);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		System.out.println("Welcome to First Session");
		D f1=new D();
		f1.get1();
		f1.get2();
	}

}
