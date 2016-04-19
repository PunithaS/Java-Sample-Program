package java8test;

public class Test3 {
	private  static final int a;
	static{
		a=10;
		//a=20;
		
	}
	public int number1(int number)
	{
		number++;
		return number;
	}

	public static void main(String[] args) {
		Test3 t= new Test3();
		int i=10;
		t.number1(i);
		System.out.println(i);
		System.out.println();
	}public Test3() {
		// TODO Auto-generated constructor stub
	}
}
