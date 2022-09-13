
public class Demo {

	public static void main(String[] args) {
		
		int t=123;
		int sum=0,rem=0;
		while (t != 0)
		   {
		      rem = t % 10;
		      sum       = sum + rem;
		      t         = t / 10;
		   }
       System.out.println("Your Sum of digits::"+sum);
	}

}
