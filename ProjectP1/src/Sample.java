import java.util.Scanner;

class Demo
{
	int age,sal,bns;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Your age is>=18");
		}
		else
		{
			System.out.println("Your age is<=18");
		}
	}
	void get2()
	{
		System.out.println("Enter the age::");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter Your Salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your Salary+Bns::"+bns);
						
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your Salary+Bns::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low..");
		}
	}
}

public class Sample
{

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();
		f1.get2();

	}

}
