package assignment;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the n value");
		
		int n= f.nextInt();
		int fb[]= new int[n+2];
		fb[0]=0;
		fb[1]=1;
		for(int i=2;i<=n;i++)
		{
			fb[i]=fb[i-1]+fb[i-2];
			
		}

		for(int i=0;i<=n;i++)
		{
			System.out.println(fb[i]);
			
		}
		
		
	}

}
