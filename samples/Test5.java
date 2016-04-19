package java8test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s1=null;
		int x=0;
		for (int i=0;i<3;i++)
		{
			 s1=sc.next();
			 x=sc.nextInt();
			 for(int j=0;j<=i;j++)
			 System.out.printf("%-15s%03d%n", s1, x);
		
		}
		
	}

}
