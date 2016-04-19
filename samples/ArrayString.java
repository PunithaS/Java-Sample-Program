package samples;

public class ArrayString {


	public static void main(String[] args)
	{
		
		
		String[] arrstr= new String[5];
		arrstr[0]="I";
		arrstr[1]="am";
		arrstr[2]="a";
		arrstr[3]="Java";
		arrstr[4]="Programmer";
		//Printing a string array
	/*	for( int i=0; i<arrstr.length;i++)
		{
			System.out.print(arrstr[i] + " ");
		}
		
	*/
		// Printing in reverse
		
		for( int i=arrstr.length-1; i>=0;i--)
		{
			System.out.print(arrstr[i] + " ");
		}
		
	}
	

}
