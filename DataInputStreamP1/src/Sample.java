import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	int cid;
	String cname;
	DataInputStream dis=new DataInputStream(System.in);
	
	void get1() throws IOException
	{
		System.out.println("Enter the Cid is::");
		cid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the Cname is::");
		cname=dis.readLine();
		
	}
	void display()
	{
		System.out.println("Your data is::"+cid+""+cname);
	}
}


public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo s1=new Demo();
		s1.get1();
		s1.display();

	}

}
