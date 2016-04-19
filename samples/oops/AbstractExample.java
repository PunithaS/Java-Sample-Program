package samples.oops;

public abstract class AbstractExample {
private String name;
private int number;
public AbstractExample(String name,int number)
{
	System.out.println("Constructing an Employee");
	this.name=name;
	this.number=number;
	
}
public void mailCheck(){
	System.out.println("mailing check in abstract class"+this.name+" " +this.number);
	
}
}
