package java8test;

import java.util.ArrayList;
import java.util.List;

public class Lion {
	public void roar(String roar1,StringBuilder roar2)
	{
		roar1.concat("!!!");
		roar2.append("!!!");
	}
	public static void main(String[] args) {
		String roar1="Roar";
		StringBuilder roar2=new StringBuilder("Roar");
		new Lion().roar(roar1, roar2);
		System.out.println(roar1+"  "+roar2);
		
		
		String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		System.out.println(letters.charAt(5));
		
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
		System.out.println("*******************");
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if ( "2cfalse"==a) System.out.println("==");
		if ( a.equals("2cfalse")) System.out.println("equals");
		System.out.println("^^^^^^^^^^^^^^^^^^^^");

		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s)) System.out.println("one");
		if (t == s) System.out.println("two");
		if (t.equals(s)) System.out.println("three");
		if ("Hello" == s) System.out.println("four");
		if ("Hello" == t) System.out.println("five");
		
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%");
		int total = 0;
		StringBuilder letters1 = new StringBuilder("abcdefg");
		System.out.println(letters1.reverse());
		total += letters1.substring(1, 2).length();
		total += letters1.substring(6, 6).length();
		//total += letters1.substring(6, 5).length();
		//it will throw exception
		
		System.out.println(total);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");
		
		char[] c=new char[6];
		int length=c.length;
		System.out.println(length);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@");

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		//list.add(7);
		for(String s1 : list) System.out.print(s1);
		
	}

}
