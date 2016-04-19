package inheritanceExample;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] numbers={6,4,8};
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
		System.out.println(numbers[i]);
		System.out.println("************");
		int a1=10;
		String aa=String.valueOf(a1+10);
		System.out.println(a1+" "+aa);
		
		String bb="10";
		//int a2=Integer.parseInt(bb+20);
	//	int a2=(int)(bb*10);
		float a2=Float.parseFloat(bb);
		
		System.out.println(a2);
		
		
		System.out.println("************");
		
		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for(int i=0;i<numbers.length;i++)
			System.out.println(strings[i]);
		//for (String string : strings)
		//System.out.print(string + " ");
		
		
		int [] a={2,4,5,8};//sorted array
		System.out.println(Arrays.binarySearch(a, 2));
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, 3));// take the 3's position in array
		//it should be in a[1] ... so negate 1 and subtract 1
		//ie. -1-1= -2 is  the answer
		System.out.println(Arrays.binarySearch(a, 6));
		//its position should be a[3].. so -3-1= -4
		System.out.println(Arrays.binarySearch(a, 7));
		System.out.println(Arrays.binarySearch(a, 8));//-4-1= -5
		System.out.println(Arrays.binarySearch(a, 9));

	}

}
