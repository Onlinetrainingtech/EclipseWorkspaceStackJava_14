import java.util.HashMap;
import java.util.Map;

class Demo
{
	HashMap<Integer,String>list1=new HashMap<>();
	void get1()
	{
		list1.put(1001,"azar");
		list1.put(1002,"mohamed");
		list1.put(1003,"raja");
		
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
			
		}
		System.out.println("Searching the data is::"+list1.containsKey(1001));
		System.out.println("Remove the data is::"+list1.remove(1001));
		System.out.println("After Removing size of data is::"+list1.size());
		System.out.println("Total data is::"+list1);
		
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		f1.get1();

	}

}
