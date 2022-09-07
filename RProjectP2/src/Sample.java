import java.util.Scanner;

class Foo
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid...");
		empid=sc.nextInt();
		System.out.println("Enter the empname..");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.input();
		f1.display();
	}

}
