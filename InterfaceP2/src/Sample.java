interface B1
{
	int pid=1001;
	void get1();
}
interface B2 extends B1
{
	String pname="welcome";
	void get2();
}
class Demo implements B2
{

	@Override
	public void get1() {
		System.out.println("Your data is::"+pid);
		
	}

	@Override
	public void get2() {
		
		System.out.println("Your data is::"+pname);
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
