package samples;

import java.util.Scanner;

public class FindingPower {

	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter denominant :");
	int denom=s.nextInt();
	System.out.println("Enter power value:");
	int power=s.nextInt();
	int result =0;
	
	for(int i=1;i<=power;i++)
	{
		result += denom* i;
		
	}
	System.out.println(result);
	
		

	}

}
