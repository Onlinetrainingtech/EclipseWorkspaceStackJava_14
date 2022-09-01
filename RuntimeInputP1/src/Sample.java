import java.util.Scanner;

public class Sample {

	int pid;
	String pname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the Pid and Pname::");
		pid=sc.nextInt();
		pname=sc.next();
		System.out.println("Your data is::"+pid+""+pname);
	}
	/*void display()
	{
		
	}*/
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		//s1.display();

	}

}
