package samples.oops;
class Cal
{
	 int a;
	 int z;
	protected void add(int x, int y)
	{
		a=a+1;
	z=x+y;
	System.out.println("Addition ="+ z);	
	System.out.println("a "+a );
	}
	protected void sub(int x, int y)
	{
		a=a+1;
		z=x-y;
		System.out.println("sub ="+z);
		System.out.println("a "+a );
	}
}
public class Calculator extends Cal {
int x,y;
	public void mul(int x, int y)
	{
		a=a+1;
		z=x*y;
		System.out.println("mul = "+z);
		System.out.println("a "+a );
	}
	public static void main(String[] args) 
	{
		Calculator c= new Calculator();
		
		int x=10,y=5;
		c.add(x, y);
		c.sub(x, y);
		c.mul(x, y);
		boolean result = c instanceof Cal;
		System.out.println(result);
	//	a=a+1;
	//	System.out.println("a "+a );
	}

}
