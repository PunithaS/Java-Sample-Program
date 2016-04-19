package samples.simple;

public class StringCompare1 {

	public static void main(String[] args) {
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));  
		   System.out.println(s1.equals(s3));
		   System.out.println(s1.equals(s4));
		   
		   //equals compare the values inside the reference

		   String a1="Sachin";  
		   String a2="SACHIN";  
		   System.out.println(a1.equals(a2));//false  
		   System.out.println(a1.equalsIgnoreCase(a2));//true  
		 
		   // == compare the reference not the value inside it
		   
		   String b1="Sachin";  
		   String b2="Sachin";  
		   String b3=new String("Sachin");  
		   System.out.println(b1==b2);//true (because both refer to same instance)  
		   System.out.println(b1==b3);//false(because s3 refers to instance created in nonpool)  
	
		   
		   
		   String c1="sachin";  
		   String c2="sbchin";  
		   String c3="ratan";  
		   System.out.println(c1.compareTo(c2));//0  
		   System.out.println(c1.compareTo(c3));//1(because s1>s3)  
		   System.out.println(c3.compareTo(c1));//-1(because s3 < s1 )  
	
	
	
	
	
	
	
	
	}

}
