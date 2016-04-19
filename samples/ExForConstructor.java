package samples;

public class ExForConstructor {
	
	//ExForConstructor(int a,int b){System.out.println(a+b);}  
	ExForConstructor(int a,int b,int c)
	{
	int a1=a;
	int b1= b;
	int c1 =c;
		System.out.println(a1+b1+c1);} 
	//void display(){System.out.println("hai");}  
	public static void main(String[] args) {
		ExForConstructor s1 = new ExForConstructor(10,20,30);
		System.out.println(s1);

		//s1.display();

	}

}
