package samples.simple;

public class String1 {

	public static void main(String[] args) {

		 String s="Sachin";  
		 String c="Sachin";
		// s=s.concat(c);
		   s.concat(" Tendulkar");//concat() method appends the string at the end  
		   System.out.println(s);//will print Sachin because strings are immutable objects  
		   System.out.println(c);
	}

}
