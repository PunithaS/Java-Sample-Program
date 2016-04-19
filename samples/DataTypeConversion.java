package samples;

public class DataTypeConversion {

	public static void main(String[] args) {
	byte a=40;
	byte b=50;
	byte c=100;
	int d=(a*b)/c; // automatically byte convert into int
	System.out.println(d);

		int x=42;
		double y=42.23;
		System.out.println("x mod 10 = "+ x%10);
		System.out.println("y mod 10 = "+ y%10);
		
		
		int m,n;
		m=42;
		n=m++;
		System.out.println(m +" "+ n);
		
	}

}
