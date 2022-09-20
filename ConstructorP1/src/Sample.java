class Demo
{
	String p1;
	int p2;
	Demo()
	{
		System.out.println("Demo is an default cons..");
	}
	void get2(String pname,int pid)
	{
		this.p1=pname;
		this.p2=pid;
		System.out.println("Your name is::"+pname+""+pid);
	}
	void get1()
	{
		System.out.println("This is normal function.."+p1+""+p2);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
		//Demo f1new Demo("apple",1001);
		f1.get1();
		f1.get2("apple",1001);

	}

}
