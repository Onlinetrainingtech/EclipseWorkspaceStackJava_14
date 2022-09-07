import java.util.Scanner;


public class Sample {

	static void get1()
	{
		System.out.println("Get1 function..");
	}
	static void get2()
	{
		System.out.println("Get2 function..");
	}
	public static void main(String[] args) {
		
		int exp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the exp::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1:
			get1();
			break;
		case 2:
			get2();
			break;
		default:
			System.out.println("This is default case");
		}
		

	}

}
