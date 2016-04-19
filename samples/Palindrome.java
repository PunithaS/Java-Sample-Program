package assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner p=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=p.nextInt();
		int pali=number;
		int remainder;
		int reverse=0;
		while(pali!=0)
		{
			remainder=pali % 10;
			reverse= reverse * 10 + remainder;
			pali=pali/10;
			
		}
		if (number==reverse)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");

		}
				
		
		
	}

}
