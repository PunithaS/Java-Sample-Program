package samples;

import java.util.Scanner;

public class ArrayOddEg {
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	System.out.println("Enter total no of array");
	int number= s.nextInt();
	
	//int arrayvalue[] = {1,2,3,4,5,6,7,8,9,10};
	
	int arrayvalue[]=new int[number];
	int i;
	System.out.println("enter the values");
	for(i=0;i<number;i++)
	{
		arrayvalue[i]=s.nextInt();
	}
	for (i=0;i<number;i++)
	{
		if(arrayvalue[i] % 2 == 1)
			System.out.println(arrayvalue[i]+ "is odd");
		
		//else
			//System.out.println(arrayvalue[i] + "is even");
	
	}
	s.close();
}

}


