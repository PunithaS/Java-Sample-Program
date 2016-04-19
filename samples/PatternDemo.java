package samples;

public class PatternDemo {

	public static void main(String[] args) {
int num=15;
int temp=1;
for (int i=1;i<=num;i++)
{
	for (int k = i; k <num; k++)
		   System.out.print(" ");
	
			for (int j =1; j <= i; j++)
			{
				 System.out.print("" +temp+ " ");
				 temp++;
				 
				 if(temp>15)
				 {
				       break;
				 } 
			}
	 System.out.println();
	if(temp>15){
		break;
	}
}
}

}
