import java.util.Scanner;

class Demo
{
	int a1,b1;
	Scanner sc=new Scanner(System.in);
	void bitwiseOperators()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		//b1=sc.nextInt();
		//System.out.println("BitWiseAND::"+(a1&b1));
		//System.out.println("BitWiseOR::"+(a1|b1));
		System.out.println("LeftShit::"+(a1<<1));
	}
	void assigmentOperator()
	{
		
	}
	void comparisionOperator()
	{
		
	}
	void LogicalOperator()
	{
		
	}
	
}
public class Sample {

	public static void main(String[] args) {

		Demo t1=new Demo();
		//t1.arithmeticOperators();
		//t1.assigmentOperator();
		//t1.comparisionOperator();
		//t1.LogicalOperator();
		t1.bitwiseOperators();

	}

}
