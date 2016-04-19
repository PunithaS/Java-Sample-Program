package samples;

public class StringDemo {

	public static void main(String[] args) {
		int a=10;
		System.out.println("abc".length());
		String s="hai"+a+"hai";
		
		System.out.println(s.length());
		String s1="four :"+2+2;
		String s2="Four :"+(2+2);
		System.out.println(s1+" "+s2);

		String a1[]={"This","is","my","own","program.","Let's","see","the",
				"result"};
		for(int j = 0; j < a1.length; j++) {
			for(int i = j + 1; i < a1.length; i++) {
			if(a1[i].compareTo(a1[j]) < 0) {
			String t = a1[j];	
			a1[j] = a1[i];
			a1[i] = t;
			}
			}
			System.out.println(a1[j]);
			}
			
		}


	

}
