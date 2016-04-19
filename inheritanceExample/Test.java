package inheritanceExample;

public class Test {

	public static void main(String[] args) {
		//int anima [];
		//int [] animals;
		
		Test t1=new Test();
		Test t2=new Test();
		Test t3=t1;
		System.out.println("comparing objects");
		System.out.println(t1==t2);
		//System.out.println(t1==t1);
		System.out.println(t1==t3);
		System.out.println(t1.equals(t2));
		System.out.println("end of comparing objects");
		
		System.out.println("ABC".equals("ABC"));
		System.out.println("ABC"=="ABC");
		if(true)
		{
			System.out.println("hai");
		}
		//string builder
		StringBuilder sb=new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same=sb.append("+end");
		System.out.println(same);
		System.out.println(sb);
		same.append("+test");
		System.out.println(same);
		System.out.println(sb);
		
		//string
		String sb1=new String("start");
		sb1.concat("+middle");
		String same1=sb1.concat("+end");
		System.out.println(same1);
		System.out.println(sb1);
		same1.concat("+test");
		System.out.println(same1);
		System.out.println(sb1);
		
		
		String sb2 = new String().concat("1").concat("c");
		sb2=sb2.concat("-").concat("true");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder().append(1).append('c');
		sb3.append("-").append(true);
		System.out.println(sb3);
		sb3.reverse();
		System.out.println(sb3);
		/*String s="hai this is the test line";
		System.out.println(s.substring(6));
		int a=10000,b=2;
		try{
			int c=a/b;
		}
		catch(Exception e){
			System.out.println("exception");
		}finally{
			System.out.println("finally");
		}*/
	}

}
