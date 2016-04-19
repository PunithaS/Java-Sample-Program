package inheritanceExample;

public class DemoBoxWeight {

	public static void main(String[] args) {
		Boxweight box1= new Boxweight(5,4,2,10);
		Box box2=new Box(5,5,5);
		double volume=box1.volume();
		System.out.println("Volume "+volume);
		volume=box2.volume();
		System.out.println("Volume "+volume);
		System.out.println("Weight "+box1.weight);

	}

}
