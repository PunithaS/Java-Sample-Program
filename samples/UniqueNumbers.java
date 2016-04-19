package assignment;

import java.util.Scanner;

public class UniqueNumbers {

	public static void main(String[] args) {
		// Print the unique numbers and also print the number of occurrences of duplicate numbers.
		
		int a[]=new int[10];
		int b[]=new int[10];
		System.out.println("Enter the total");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		
		}
		int count=0;
		
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
		{
				if(a[i]==a[j])
				{
					count=count+1;
					
				}
				else
				{
					b[i]=a[i];
				}
			}
		}
		
			for(int k=0;k<count;k++)
			{
				System.out.println(b[k]);
				
			}
			
		
		System.out.println("Count : "+count );
		
		
		

	}

}
