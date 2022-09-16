class B
{
	String pname="mobile";
	void get1()
	{
		System.out.println("This is Base Class");
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("This is Der Class"+pname);
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
