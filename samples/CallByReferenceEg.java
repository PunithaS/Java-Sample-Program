
public class CallByReferenceEg {
	static int data;  
	
	public CallByReferenceEg(int pdata)
	{
		data=pdata;
		data=data+1000;
		
	}
	  
	 void change(int hdata){  
	 data=data+100;//changes will be in the local variable only  
	   System.out.println("after change "+data);  

	 
	 }  
	 public static void main(String args[]){  
		// CallByReferenceEg op=new CallByReferenceEg();  
		 CallByReferenceEg op1=new CallByReferenceEg(200);
			  
			   System.out.println("before change "+data);  
			 op1.change(500);  
			   System.out.println("after change "+data);  
	}

}
