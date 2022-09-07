class Foo
{
	void get1()
	{
		char exp='a';
		switch(exp)
		{
		case 'a':
			System.out.println("Case-1");
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("Default Case");
			
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();

	}

}
