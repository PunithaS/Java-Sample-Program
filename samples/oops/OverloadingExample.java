package samples.oops;
class Overload{
void test(double a){
	System.out.println("inside double test"+ a);
}
void test(int a,int b){
	System.out.println("inside int and int");
}
}
public class OverloadingExample {

	public static void main(String[] args) {
		int i=80;
		Overload obj=new Overload();
		obj.test(i);//type conversion will takes place form int to double
		obj.test(123,i);// here int will not automatically converts into double or float
		//obj.test(123.4,234f)// will not work
	}

}
