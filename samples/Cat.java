package java8test;

interface Walk{
	static int getspeed(){
		return 5;
	}
}
interface Run{
	static int getspeed(){
		return 6;
	}
}
interface Hop{
	static int getnumber(){
		return 6;
	}
}
public class Cat implements Walk,Run{
	public int getspeed(){
		return 10;
	}
	
	public static void main(String[] args) {
		System.out.println(new Cat().getspeed());
		System.out.println(Walk.getspeed());
		
		//System.out.println(Hop.getnumber());

	}

}
