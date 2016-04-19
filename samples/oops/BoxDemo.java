//Constructor Example

package samples.oops;
class Box{
	double width;
	double height;
	float depth;
	Box(){
		System.out.println("Im in constructor");
		width=10;
		height=20;
		depth=20.5f;
		
	}
	Box(double width,double height,float depth){
		System.out.println("Im in parameter constructor");

		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	double volume(){
		return  (width*height*depth);
		
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box b1=new Box();
		Box b2=new Box(10,10,10.5f);
		double vol;
		vol=b1.volume();
		System.out.println(vol);
		vol=b2.volume();
		System.out.println(vol);

	}

}
