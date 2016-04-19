package samples;

public class SeperatingNumbersAndStrings {
public static void main(String[] args) {
	String a="a1b26c3d4";
char b;
String n="";
String s="";
	for (int i=0;i<a.length();i++)
	{
		
		b=a.charAt(i);
	
		//String numconcat;
	//	StringBuilder sb = new StringBuilder();
		

		if (b>='0' && b<='9')
		{
			//sb.append(b);
			
		//	numconcat = sb.toString();
		//	System.out.print(numconcat);	
			
			//this will change char to string and then concatinate
			 s=s.concat(String.valueOf(b));
			
		}
		
		}
	System.out.println(s);
	
	// this will convert String to int
	int c=Integer.parseInt(s)+100;
	System.out.println(c);
s=String.valueOf(c);
System.out.println(s);

System.out.println();
for (int i=0;i<a.length();i++)
{
	
	b=a.charAt(i);
	
	if (!(b>='0' && b<='9'))
	{
		n=n.concat(String.valueOf(b));
	}
}
System.out.println(n);

	System.out.println();
}
}
