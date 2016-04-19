package samples.oops;
class Test{
	int a,b;
	Test(int i,int j){
		a=i;
		b=j;
	}
	//return true if object is equal to the invoking object
	boolean equals(Test o){
		if (o.a==a && o.b==b) return true;
		else
			return false;
		
	}
}
public class PassingObjectParameter {

	public static void main(String[] args) {
		Test ob1=new Test(100,200);
		Test ob2=new Test(100,200);
		//Test ob2=ob1; // this will also be the same effect
		System.out.println("ob1==ob2 :"+ ob1.equals(ob2));
		
	}

}
