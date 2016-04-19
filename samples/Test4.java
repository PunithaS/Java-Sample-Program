package java8test;

public class Test4 {
	public void show(int a)
	{
		System.out.println("Int");
	}
	public void show(byte b)
	{
		System.out.println("Byte");
	}
	public void show(float c)
	{
		System.out.println("Float");
	}
	public void show(Object o)
	{
		System.out.println("Object");
	}
	static public  void main(String... args) {
		Test4 d=new Test4();
		short s=123;
		d.show(s);
		d.show(true);
		d.show(12.34f);
		
		
	}
}
/*class Display
{
	
}*/

