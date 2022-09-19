class Demo
{
	void get1(int cid)
	{
		System.out.println("This is get1 function::"+cid);
	}
	void get1(String cname)
	{
		System.out.println("This is get2 function::"+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001);
		f1.get1("mobile");

	}

}
