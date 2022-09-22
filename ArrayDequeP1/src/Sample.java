import java.util.ArrayDeque;

class Demo
{
	ArrayDeque<Integer>g1=new ArrayDeque<Integer>();
	void get1()
	{
		g1.addFirst(1000);
		g1.add(1001);
		g1.addLast(2001);
		g1.add(1002);
		
		System.out.println("Your value is::"+g1);
		System.out.println("Remove the data is::"+g1.removeLast());
		System.out.println("****"+g1.retainAll(g1));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
	}

}
