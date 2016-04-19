package assignment;

import java.util.Scanner;

public class ApowerB {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter denominant :");
		int denom=s.nextInt();
		System.out.println("Enter power value:");
		int power=s.nextInt();
		int result =1;
		
		for(int i=1;i<=power;i++)
		{
			result *= denom;
			
		}
		System.out.println(result);
		
	}

}
