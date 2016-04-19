package samples;

public class exforMethodOverloading {

	 public static void main(int a){  
	 System.out.println(a);  
	  }  
		    
		  public static void main(String args[]){  
		  System.out.println("main() method invoked");  
		  main(10);  
		  }
		 
	
	
	
		 /* method overloading by typepromotion
		  * 
		  * void sum(int a,int b){System.out.println("int arg method invoked");}  
		  void sum(long a,long b){System.out.println("long arg method invoked");}  
		  
		  public static void main(String args[]){  
		  exforMethodOverloading obj=new exforMethodOverloading();  
		  obj.sum(3456L,3456L);//now int arg sum() method gets invoked  
		  }  */
	
	
	/*
	void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	 
	  public static void main(String args[]){  
	  exforMethodOverloading obj=new exforMethodOverloading();  
	  obj.sum(20L,20);//now ambiguity  
	  }  
	  */
	/* THIS WILL BE THE DIFFERNCE BETWEEN METHOD OVERLOADING
	 *  AND CONSTRUCTOR
	 * WE CAN NOT PASS PARAMETER WHILE CREATING OBJECT
	 
	 void sum(int a,int b){System.out.println(a+b);}  
	 // void sum(int a,int b,int c){System.out.println(a+b+c);}  
	  
	  public static void main(String args[]){  
	  exforMethodOverloading obj=new exforMethodOverloading(10,10);  
	  // we cannot pass parameter here. so error will come
	   
	 // obj.sum(10,10,10);  
	  obj.sum(20,20);  
	  
	  }  */
	
		}  

