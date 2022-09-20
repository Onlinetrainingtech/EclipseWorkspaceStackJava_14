abstract class Shape
{
	abstract void draw();
}
//In real scenario implementation is provided by others i.e)unknown by enduser
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle..");
	}
}
class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
//In real scenario method is called by programmer or user
public class TestAbstarction1 {

	public static void main(String[] args) {
		
		Shape s=new Circle1();//In a real,object is provided through method
		s.draw();

	}

}
