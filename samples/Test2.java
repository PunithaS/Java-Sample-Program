package java8test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);
		char[] a={'p','u','n','i'};
		int z=Arrays.binarySearch(a, 'u');
		System.out.println(z);
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		
		
		
		List<Integer> list=Arrays.asList(4,2,-1,6);
		Collections.sort(list);
		Integer k[]=list.toArray(new Integer[4]);
		System.out.println(k[0]);
		System.out.println("#####################");
		
		
		List<Integer> ls=new ArrayList<>();
		ls.add(Integer.parseInt("10"));
		ls.add(Integer.valueOf(5));
		ls.add(8);
		//ls.add(null);// this will throw runtime exception
		for(int l:ls)
			System.out.println(l);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		List<String> one=new ArrayList<>();
		one.add("abc");
		List<String> two=new ArrayList<>();
		two.add("abc");
		if(one==two)
			System.out.println("A");
		else if(one.equals(two))
			System.out.println("B");
		else
			System.out.println("C");
		
		
		
	//	LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		//this will compile but throw exception
		
	}

}
