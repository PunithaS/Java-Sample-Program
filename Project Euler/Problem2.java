package easy;

public class Problem2 {
//fibonacci numbers
	
	public static void main(String[] args) {
		 int n1=0,n2=1,n3,i,count=0;    
		 //System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=1;i<50;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {   
		  n3=n1+n2;    
		  if (count>4000000)
			  break;
		 if (n3%2==0)
		  {
		  //System.out.print(" "+n3);    
		  count=count+n3;
		  }
		  n1=n2;    
		  n2=n3;    
		 }  
		  
		 System.out.println(count);
	}

}
