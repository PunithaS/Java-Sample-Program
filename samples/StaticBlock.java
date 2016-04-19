package samples;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("welcome");
		

	}
	static {
	    String os = System.getProperty("os.name");
	    String osv= System.getProperty("os.version");
	    System.out.println(os);
	    System.out.println(osv);
	    
	   if (os.equals("Mac OS X") != true) {
	    System.exit(1);
	   }
	  }   
/*	static {
	    System.out.println("Static block is executed before main method.");
	  }   */
	
}
