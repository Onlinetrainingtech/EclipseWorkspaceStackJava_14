
public class Sample
{
	String pname="apple";//class or instance variables
    void get1()
    {
    	int pid=1001;//local variable
    	System.out.println("This is Get1 function::"+pid+""+pname);
    }
    void get2(int cid,String cname)//argument passing
    {
    	System.out.println("This is Get2 function::"+cid+""+cname);
    }
	public static void main(String as[]) {
		
		System.out.println("MainIn");
		Sample s1=new Sample();
		s1.get1();
		s1.get2(2001,"mobile");
		System.out.println("MainOut");

	}

}
